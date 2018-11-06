package com.bignerdranch.android.calculator_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mainTV;
    public static final String TAG = "vickcle:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

    }

    //按钮，用于跳转界面
    public void commonCalculator(View view) {
        Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
        startActivity(intent);
        finish();
    }
}
