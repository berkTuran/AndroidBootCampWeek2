package com.berkturan.androidbootcampweek2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText userNameEditText, fullNameEditText, mailEditText, birthYearEditText, studentNumberEditText;
    Button signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        userNameEditText = findViewById(R.id.userNameEditText);

        fullNameEditText = findViewById(R.id.fullNameEditText);

        mailEditText = findViewById(R.id.emailEditText);

        birthYearEditText = findViewById(R.id.birthYearEditText);

        studentNumberEditText = findViewById(R.id.studentNumberEditText);

        signUpButton = findViewById(R.id.signUpButton);

        final Intent intent = new Intent(this, SecondActivity.class);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("userName", userNameEditText.getText().toString());
                intent.putExtra("fullName", fullNameEditText.getText().toString());
                intent.putExtra("email", mailEditText.getText().toString());
                intent.putExtra("birthYear", birthYearEditText.getText().toString());
                intent.putExtra("studentNumber", studentNumberEditText.getText().toString());
                startActivity(intent);
            }
        });


    }
}