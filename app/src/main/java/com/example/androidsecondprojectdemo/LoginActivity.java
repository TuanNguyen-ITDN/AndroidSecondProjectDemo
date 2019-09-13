package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button button_login = (Button) findViewById(R.id.button_login);

        final EditText edit_text_email = (EditText) findViewById(R.id.edit_text_email);
        final EditText edit_text_password = (EditText) findViewById(R.id.edit_text_password);


        button_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                String email = edit_text_email.getText().toString().trim();
                String password = edit_text_password.getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                if (email.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter email address", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();

                } else if (email.matches(emailPattern)) {
                    Intent loginIntent = new Intent(view.getContext(), HomeActivity.class);
                    loginIntent.putExtra("email", email);
                    loginIntent.putExtra("password", password);
                    startActivityForResult(loginIntent, 0);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
