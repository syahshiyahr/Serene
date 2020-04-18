package com.example.serene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button back, reg;
    private EditText username, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        back = findViewById(R.id.btn_back_register);
        reg = findViewById(R.id.btn_reg_register);
        username = findViewById(R.id.et_username_register);
        email = findViewById(R.id.et_email_register);
        password = findViewById(R.id.et_password_register);

        back.setOnClickListener(this);
        reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_register:
                onBackPressed();
                break;
            case R.id.btn_reg_register:
                Intent reg = new Intent(this, MainActivity.class);
                startActivity(reg);
                break;
        }
    }
}
