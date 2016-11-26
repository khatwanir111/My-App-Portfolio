package com.irk.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMovies(View v){
        Toast.makeText(this, "This Button will launch Populat Movies App", Toast.LENGTH_SHORT).show();
    }
    public void sendHawk(View v){
        Toast.makeText(this, "This Button will launch Stock Hawk App", Toast.LENGTH_SHORT).show();
    }
    public void sendBigger(View v){
        Toast.makeText(this, "This Button will launch Built it bigger projetc", Toast.LENGTH_SHORT).show();
    }
    public void sendMaterial(View v){
        Toast.makeText(this, "This Button will launch your app with Material Design", Toast.LENGTH_SHORT).show();
    }
    public void sendUbiquitous(View v){
        Toast.makeText(this, "This Button will launch your app with Ubiquitous mode", Toast.LENGTH_SHORT).show();
    }
    public void sendMyApp(View v){
        Toast.makeText(this, "This Button will launch My Capstone Project", Toast.LENGTH_SHORT).show();
    }

}
