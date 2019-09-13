package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button button_login = (Button)findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent inn1 = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(inn1);
            }

        });
    }
}
