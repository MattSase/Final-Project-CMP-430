package com.example.smartboxshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    public static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d(TAG,"start of onCreate in LoginActivity");

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);


        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        // admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                       Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                       startActivity(intent);

               }else
                   Toast.makeText(LoginActivity.this, "Failed", Toast.LENGTH_SHORT).show();


            }
        });

        Log.d(TAG,"End of onCreate in LoginActivity");


    }
}