package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class checkDeviceRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_device_run);
    }

    public void onNextButtonClicked(View v){
        Intent intent = new Intent(this,insertName.class);
        startActivity(intent);
    }

    public void onReturnButtonClicked(View v){
        finish();
    }
}
