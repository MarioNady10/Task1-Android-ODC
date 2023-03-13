package com.example.task1_android_odc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(".MainActivity", "onCreate:");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(".MainActivity", "onStarte:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(".MainActivity", "onResume:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(".MainActivity", "onPause:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(".MainActivity", "onStop:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(".MainActivity", "onRestart:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(".MainActivity", "onDestroy:");
    }
}