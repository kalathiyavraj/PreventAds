package com.Ads.PreventAds.NativeAds;

import android.app.Activity;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;



public class PreventNativeAds {

    public void ShowRegularNative(final Activity activity, String AdsId,final ViewGroup viewGroup) {




            AdLoader.Builder builder = new AdLoader.Builder(activity, AdsId);
            builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                @Override
                public void onNativeAdLoaded(@NonNull com.google.android.gms.ads.nativead.NativeAd nativeAd) {


                    new InflatAds(activity).inflat_admobnativemedium(nativeAd, viewGroup);
                }

            });
            AdLoader adLoader = builder.withAdListener(new AdListener() {
                @Override
                public void onAdFailedToLoad(LoadAdError loadAdError) {

                    AdLoader.Builder builder = new AdLoader.Builder(activity, AdsId);
                    builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(@NonNull com.google.android.gms.ads.nativead.NativeAd nativeAd) {


                            new InflatAds(activity).inflat_admobnativemedium(nativeAd, viewGroup);
                        }

                    });
                    AdLoader adLoader = builder.withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError loadAdError) {


                        }
                    }).build();
                    adLoader.loadAd(new AdRequest.Builder().build());

                }
            }).build();
            adLoader.loadAd(new AdRequest.Builder().build());

    }


    public void ShowSmallNative(final Activity activity,String AdsId, final ViewGroup viewGroup) {


            AdLoader.Builder builder = new AdLoader.Builder(activity, AdsId);
            builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                @Override
                public void onNativeAdLoaded(@NonNull com.google.android.gms.ads.nativead.NativeAd nativeAd) {

                    new InflatAds(activity).inflat_admobnativesmall(nativeAd, viewGroup);

                }

            });
            AdLoader adLoader = builder.withAdListener(new AdListener() {
                @Override
                public void onAdFailedToLoad(LoadAdError loadAdError) {

                    AdLoader.Builder builder = new AdLoader.Builder(activity, AdsId);
                    builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(@NonNull com.google.android.gms.ads.nativead.NativeAd nativeAd) {

                            new InflatAds(activity).inflat_admobnativesmall(nativeAd, viewGroup);

                        }

                    });
                    AdLoader adLoader = builder.withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError loadAdError) {


                        }
                    }).build();
                    adLoader.loadAd(new AdRequest.Builder().build());

                }
            }).build();
            adLoader.loadAd(new AdRequest.Builder().build());

    }

    public void ShowMediumNative(final Activity activity,String AdsId, final ViewGroup viewGroup) {


            AdLoader.Builder builder = new AdLoader.Builder(activity, AdsId);
            builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                @Override
                public void onNativeAdLoaded(@NonNull com.google.android.gms.ads.nativead.NativeAd nativeAd) {

                    new InflatAds(activity).inflat_admobnative(nativeAd, viewGroup);

                }

            });
            AdLoader adLoader = builder.withAdListener(new AdListener() {
                @Override
                public void onAdFailedToLoad(LoadAdError loadAdError) {

                    AdLoader.Builder builder = new AdLoader.Builder(activity, AdsId);
                    builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(@NonNull com.google.android.gms.ads.nativead.NativeAd nativeAd) {

                            new InflatAds(activity).inflat_admobnative(nativeAd, viewGroup);

                        }

                    });
                    AdLoader adLoader = builder.withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError loadAdError) {


                        }
                    }).build();
                    adLoader.loadAd(new AdRequest.Builder().build());

                }
            }).build();
            adLoader.loadAd(new AdRequest.Builder().build());

    }

}
