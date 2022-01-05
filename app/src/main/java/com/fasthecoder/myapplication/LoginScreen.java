package com.fasthecoder.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {
    private Button login_button;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        login_button = findViewById(R.id.login_button);

    }
    protected void goToHomescreen(){

        Log.d(TAG, "goToHomescreen: Going to HomeScreen");
        Toast.makeText(this, "going to homescreen", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    public void logicButtonClicked(View view) {
        goToHomescreen();
    }
}