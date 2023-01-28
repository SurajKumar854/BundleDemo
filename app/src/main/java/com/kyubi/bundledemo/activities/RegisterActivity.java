package com.kyubi.bundledemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kyubi.bundledemo.R;

public class RegisterActivity extends AppCompatActivity {

    EditText nameEdt, emailEdt, passEdt;
    Button registerBtn, dashBoardBtn;
    TextView notifyUserTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initialize();
        registerUser();
        dashBoard();


    }


    void initialize() {
        nameEdt = findViewById(R.id.nameEdt);
        emailEdt = findViewById(R.id.emailEdt);
        passEdt = findViewById(R.id.passEdt);
        registerBtn = findViewById(R.id.registerBtn);
        dashBoardBtn = findViewById(R.id.dashboardBtn);
        notifyUserTv = findViewById(R.id.notifyUserTv);
    }


    void registerUser() {


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameStr = nameEdt.getText().toString();
                notifyUserTv.setText("Welcome " + nameStr + " Your Profile Added");
            }
        });

    }

    void dashBoard() {
        dashBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(RegisterActivity.this, DashBoardActivity.class);


                String nameStr = nameEdt.getText().toString();
                String emailStr = emailEdt.getText().toString();
                String passStr = passEdt.getText().toString();

                Bundle b = new Bundle();
                b.putString("name", nameStr);
                b.putString("email", emailStr);
                b.putString("pass", passStr);
                mIntent.putExtras(b);


                startActivity(mIntent);
            }
        });
    }
}