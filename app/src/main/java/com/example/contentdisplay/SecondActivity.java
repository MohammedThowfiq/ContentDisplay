package com.example.contentdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tname,tage,tgender,tclgname;
    String name,age,gender,clgname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        name = intent.getStringExtra("Name");
        age = intent.getStringExtra("Age");
        gender = intent.getStringExtra("Gender");
        clgname = intent.getStringExtra("CollegeName");


        tname.setText(name);
        tage.setText(age);
        tgender.setText(gender);
        tclgname.setText(clgname);


    }
}
