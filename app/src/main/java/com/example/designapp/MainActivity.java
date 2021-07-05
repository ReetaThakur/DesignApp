package com.example.designapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText title;
    private EditText firstName;
    private EditText lastName;
    private EditText workEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.selectOption);
        firstName=findViewById(R.id.jonathan);
        lastName=findViewById(R.id.doe);
        workEmail=findViewById(R.id.edittextemail);


    }
}