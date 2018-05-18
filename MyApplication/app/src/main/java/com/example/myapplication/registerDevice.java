package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registerDevice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_device);
    }

    public void onCheckButtonClicked (View v){
        Intent intent = new Intent(this,checkDeviceRun.class);
        startActivity(intent);
    }

    //입력받은 코드가 비콘 코드가 아닐때 1.길이 2.형식 경고메세지를 출력
    //입력받은 코드가 비콘 코드일때 다음 화면으로
}
