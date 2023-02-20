package com.example.prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Create", duration);
        toast.show();

        Log.i(TAG, "onCreate info");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Start", duration);
        toast.show();

        Log.d(TAG, "onStart debug");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Stop", duration);
        toast.show();

        Log.v(TAG, "onStop verbose");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Destroy", duration);
        toast.show();

        Log.i(TAG, "onDestroy info");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Pause", duration);
        toast.show();

        Log.w(TAG, "onPause warning");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Resume", duration);
        toast.show();

        Log.e(TAG, "onResume (error");
    }
}