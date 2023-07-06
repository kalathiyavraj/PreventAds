# Prevent Ads


> Step 1. Add the JitPack repository to your build file

```gradle
     allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
 ```
  
  > Step 2. Add the dependency

  
```gradle
dependencies {

       implementation 'com.github.kalathiyavraj:PreventAds:1.0.1'

            }
  ```
  # Open Ads 
  
  > Step 1. Add Permission
  ```gradle
  
    <uses-permission android:name="android.permission.INTERNET" />
 ```
  > Step 2. Create a class like MainClass.class
  
  ```gradle
  new AppOpenManager(context, "ADMOB_OPEN_ADS_ID");
  ```
  
 > Step 3. Update menifest
  ```gradle
 name=".MyApplication"
 ```

  # Inter Ads 
  
  > Step 1. Inter Ads Load in MainActivity onCreate
  ```gradle
  Prevent_Interstitial.getInstance().loadInterOne(getApplicationContext(),"ca-app-pub-3940256099942544/1033173712");

  ```

  > Step 2. Inter Ads Show
  > You can use a counter simply to give the number of counters before giving context.
  > You not use counter simply write 1 before giving contect.

  ```gradle
    Prevent_Interstitial.getInstance().showInter(MainActivity.this,2, new Prevent_Interstitial.MyCallback()
                {
                    @Override
                    public void callbackCall()
                    {



                    }
                });

  ```
  
# Banner Ads 
  
  > Step 1.Implement Banner Ads With Size
  ```gradle
  
        RelativeLayout relativeLayout = findViewById(R.id.regular_banner);
        Prevent_Banner.showBanner(MainActivity.this,relativeLayout,"ca-app-pub-3940256099942544/6300978111", AdSize.BANNER);

 ```
 
  
 # Regular Native
  ![3324991](https://i.postimg.cc/fTfvdPts/redular-native.jpg)
  > Step 1.Implement Regular Native
  > Library set layout automatically
  ```gradle


          <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="25dp">

                <FrameLayout
                    android:id="@+id/fl_adplaceholder"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center" />

            </LinearLayout>


       new PreventNativeAds().ShowRegularNative(this,"ca-app-pub-3940256099942544/2247696110", (ViewGroup) findViewById(R.id.fl_adplaceholder));

 ```
  # Medium Native
 ![3324991](https://i.postimg.cc/RVBRNm0G/medium-native.jpg)
  > Step 1.Implement Medium Native
  > Library set layout automatically
  ```gradle


          <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="25dp">

                <FrameLayout
                    android:id="@+id/fl_adplaceholder"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center" />

            </LinearLayout>


        new PreventNativeAds().ShowMediumNative(this,"ca-app-pub-3940256099942544/2247696110", (ViewGroup) findViewById(R.id.fl_adplaceholder2));

 ```

 # Small Native
  ![3324991](https://i.postimg.cc/G3YKLtbH/small-native.jpg)
  > Step 1.Implement Small Native
  > Library set layout automatically
  ```gradle


          <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="25dp">

                <FrameLayout
                    android:id="@+id/fl_adplaceholder"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center" />

            </LinearLayout>


          new PreventNativeAds().ShowSmallNative(this,"ca-app-pub-3940256099942544/2247696110", (ViewGroup) findViewById(R.id.fl_adplaceholder3));


 ```
