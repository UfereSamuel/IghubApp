package com.example.sammy.androidclass;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sammy on 10/12/18.
 */

public class Splash extends AppCompatActivity {
    private int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Login-Activity. */

                Intent splash = new Intent(Splash.this, Login.class);
                startActivity(splash);

            }
        }, SPLASH_DISPLAY_LENGTH);


    }
}
