package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(view -> {
            if(username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
                //correct
                Toast.makeText(MainActivity.this, "Flight Schedule Successfully", Toast.LENGTH_SHORT).show();
            }else
                //incorrect
                Toast.makeText(MainActivity.this, "Flight Not Available", Toast.LENGTH_SHORT).show();

        });
    }
}