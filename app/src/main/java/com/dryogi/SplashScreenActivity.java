package com.dryogi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import activity.SelectCityActivity;

public class SplashScreenActivity extends Activity {

    int milliseconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.spalshscreen);


        milliseconds = 3 * 1000;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // check for update while user open app

                        Intent intent = new Intent(getApplicationContext(),
                                SelectCityActivity.class);
                        intent.putExtra("class", "splash");

                        startActivity(intent);
                        finish();

                        // Data not loaded yet
                        //Try one more time


                    }
                }, milliseconds);
            }
        });

    }


}
