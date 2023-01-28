package com.kyubi.bundledemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kyubi.bundledemo.R;

public class DashBoardActivity extends AppCompatActivity {


    TextView nameTv, emailTv, passTv;
    Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        initialize();
        getUserInformation();
        logOutUser();

    }

    void initialize() {
        nameTv = findViewById(R.id.nameTv);
        emailTv = findViewById(R.id.emailTv);
        passTv = findViewById(R.id.passTv);
        logoutBtn=findViewById(R.id.logoutBtn);

    }

    void getUserInformation() {
        Intent mIntent = getIntent();
        Bundle b = mIntent.getExtras();
        nameTv.setText(b.getString("name", "Guest Name"));
        emailTv.setText(b.getString("email", "Guest Email"));
        passTv.setText(b.getString("pass", "Guest Pass"));


    }

    void logOutUser() {
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this, RegisterActivity.class));
            }
        });

    }
}