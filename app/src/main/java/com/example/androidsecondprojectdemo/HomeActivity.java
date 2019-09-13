package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView myTextview = (TextView)findViewById(R.id.myTextview);
        TextView text_view_email = (TextView) findViewById(R.id.text_view_email);
        TextView text_view_password = (TextView) findViewById(R.id.text_view_password);

        final Intent infor = this.getIntent();
        String email = infor.getStringExtra("email");
        String password = infor.getStringExtra("password");

        text_view_email.setText( email);
        text_view_password.setText(password);

        myTextview.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent inn1 = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(inn1);
            }

        });
    }
}
