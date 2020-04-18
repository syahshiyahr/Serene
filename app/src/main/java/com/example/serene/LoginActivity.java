package com.example.serene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button back, signIn;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        back = findViewById(R.id.btn_back_login);
        signIn = findViewById(R.id.btn_signin_signin);
        username = findViewById(R.id.et_username_login);
        password = findViewById(R.id.et_password_login);

        back.setOnClickListener(this);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_login:
                onBackPressed();
                break;
            case R.id.btn_signin_signin:
                Intent sign = new Intent(this, MainActivity.class);
                startActivity(sign);
                break;

        }
    }
}
