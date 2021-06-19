package com.asolis.myapppoems;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Uno(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    public void Dos(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }

    public void Tres(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);


    }
}