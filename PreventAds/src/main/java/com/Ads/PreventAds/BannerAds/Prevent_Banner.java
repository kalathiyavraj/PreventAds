package com.Ads.PreventAds.BannerAds;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class Prevent_Banner {

    public static void showBanner(Activity context, RelativeLayout relativeLayout,String AdsId,AdSize size) {

        String adbanner = AdsId;


        AdView adView = new AdView(context);
        adView.setAdSize(size);
        adView.setAdUnitId(adbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Log.d("Prevent_Banner","BannerLoad");

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                Log.d("Prevent_Banner","BannerLoadError"+adError);
                adView.loadAd(adRequest);

            }

            @Override
            public void onAdOpened() {
                Log.d("Prevent_Banner","BannerAdOpened");
            }

            @Override
            public void onAdClicked() {
                Log.d("Prevent_Banner","BannerAdClicked");
            }

            @Override
            public void onAdClosed() {
                Log.d("Prevent_Banner","BannerAdClosed");
            }
        });
        relativeLayout.addView(adView);



    }

}
