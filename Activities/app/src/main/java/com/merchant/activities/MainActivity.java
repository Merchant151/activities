package com.merchant.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSend(View view){
        Intent intent = new Intent(MainActivity.this, sendActivity.class);
        startActivity(intent);
    }
    public void goToRecieve(View view){
        Intent intent = new Intent(MainActivity.this, recieveActivity.class);
        startActivity(intent);
    }

    public void goToAbout(View view){
        Intent intent = new Intent(MainActivity.this, aboutActivity.class);
        startActivity(intent);
    }
}