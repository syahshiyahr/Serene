package com.example.serene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_sign_db;
    private TextView tv_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn_sign_db = findViewById(R.id.btn_signin_dashboard);
        tv_reg = findViewById(R.id.tv_register_dashboard);

        btn_sign_db.setOnClickListener(this);
        tv_reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_signin_dashboard:
                Intent sign = new Intent(this, LoginActivity.class);
                startActivity(sign);
                break;
            case R.id.tv_register_dashboard:
                Intent reg = new Intent(this, RegisterActivity.class);
                startActivity(reg);
                break;
        }
    }
}
