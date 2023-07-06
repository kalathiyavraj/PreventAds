package com.Ads.PreventAds.Interstitial;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

import com.Ads.PreventAds.PublicUtils.Utils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Prevent_Interstitial {
    public InterstitialAd TA_interstitialOne;
    public InterstitialAd TB_interstitialTwo;
    public  static   String adsid;
    MyCallback TmyCallback;
    private static Prevent_Interstitial TInstance;

    static int gclick = 1;

    public static Prevent_Interstitial getInstance() {
        if (TInstance == null) {
            TInstance = new Prevent_Interstitial();
        }
        return TInstance;
    }

    public interface
    MyCallback {
        void callbackCall();
    }

    public void loadInterOne(final Context context,String AdsId) {
        MobileAds.initialize(context, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(
                context,
                AdsId,
                adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded( InterstitialAd interstitialAd) {
                        TA_interstitialOne = interstitialAd;
                        Log.i("TAG", "onAdLoaded 1");


                        TA_interstitialOne.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        Utils.openinter = true;
                                        // Called when fullscreen content is dismissed.
                                        TA_interstitialOne = null;
                                        Log.d("TAG", "The ad 1 was dismissed.");
                                        loadInterOne(context,AdsId);

                                        if (TmyCallback != null) {
                                            TmyCallback.callbackCall();
                                            TmyCallback = null;
                                        }
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {

                                        TA_interstitialOne = null;
                                        Log.d("TAG", "The ad 1 failed to show.");
                                        loadInterOne(context,AdsId);


                                    }
                                });
                    }

                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        Log.d("TAG", "The ad 1 Load Error.");
                        TA_interstitialOne = null;
                    }
                });
    }



    public void showInter(Activity context,int counter, MyCallback _myCallback) {

        Utils.openinter = false;

        this.TmyCallback = _myCallback;


        int click = counter;

        Utils.gclick=Utils.gclick+1;

        if (gclick == click) {
            gclick = 1;
            if (TA_interstitialOne != null) {
                //Toast.makeText(context, "Showing First Inter 1...", Toast.LENGTH_SHORT).show();
                TA_interstitialOne.show(context);
                Utils.gclick=0;
            } else if (TB_interstitialTwo != null) {
                // Toast.makeText(context, "Showing Second Inter 2...", Toast.LENGTH_SHORT).show();
                TB_interstitialTwo.show(context);
                Utils.gclick=0;
            } else {
                if (TmyCallback != null) {
                    TmyCallback.callbackCall();
                    TmyCallback = null;
                }
            }
        } else {
            gclick = gclick + 1;
            if (TmyCallback != null) {
                TmyCallback.callbackCall();
                TmyCallback = null;
            }
        }


    }



    public static void alert(final Activity context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Internet Alert");
        builder.setMessage("You need to internet connection");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.show();
    }
}