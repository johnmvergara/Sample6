package com.example.sample6;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = findViewById(R.id.tv1);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has executed...");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has executed...");
    }

    public void showMessage(View buton){
        tvMessage.setText("Button was clicked");
    }
}