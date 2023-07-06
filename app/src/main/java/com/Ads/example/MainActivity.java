package com.Ads.example;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.Ads.PreventAds.BannerAds.Prevent_Banner;
import com.Ads.PreventAds.Interstitial.Prevent_Interstitial;
import com.Ads.PreventAds.NativeAds.PreventNativeAds;
import com.google.android.gms.ads.AdSize;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //inter ads load
        Prevent_Interstitial.getInstance().loadInterOne(getApplicationContext(),"ca-app-pub-3940256099942544/1033173712");

        //inter ads show
        Button btn = findViewById(R.id.inter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Prevent_Interstitial.getInstance().showInter(MainActivity.this,2, new Prevent_Interstitial.MyCallback()
                {
                    @Override
                    public void callbackCall()
                    {



                    }
                });
            }
        });







        // banner ads small
        RelativeLayout relativeLayout = findViewById(R.id.regular_banner);
        Prevent_Banner.showBanner(MainActivity.this,relativeLayout,"ca-app-pub-3940256099942544/6300978111", AdSize.BANNER);


        //Regular native
        new PreventNativeAds().ShowRegularNative(this,"ca-app-pub-3940256099942544/2247696110", (ViewGroup) findViewById(R.id.fl_adplaceholder));

       //Medium native
        new PreventNativeAds().ShowMediumNative(this,"ca-app-pub-3940256099942544/2247696110", (ViewGroup) findViewById(R.id.fl_adplaceholder2));

       //Small native
        new PreventNativeAds().ShowSmallNative(this,"ca-app-pub-3940256099942544/2247696110", (ViewGroup) findViewById(R.id.fl_adplaceholder3));
    }
}