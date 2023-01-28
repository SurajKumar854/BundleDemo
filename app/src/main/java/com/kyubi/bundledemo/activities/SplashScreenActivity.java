package com.kyubi.bundledemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.kyubi.bundledemo.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        goToRegisterScreen();
        Log.e("Tag","SplashScreenActivity");
        Log.e("Lifecycle","OnCreate");


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Lifecycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Lifecycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Lifecycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Lifecycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Lifecycle","onDestroy");
        Log.e("Tag","SplashScreenActivity");
    }

    void goToRegisterScreen() {
        Intent mIntent = new Intent(SplashScreenActivity.this, RegisterActivity.class);
        startActivity(mIntent);

    }


}