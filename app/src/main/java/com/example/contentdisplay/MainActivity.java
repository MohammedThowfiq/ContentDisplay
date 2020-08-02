package com.example.contentdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    EditText name,age,clgname;
    Button submit;
    RadioGroup rg;
    RadioButton male,female;
    String sname,sage,sclgname,sgender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText)findViewById(R.id.et_Name);
        age = (EditText)findViewById(R.id.et_Age);
        clgname = (EditText)findViewById(R.id.et_CollegeName);
        rg = (RadioGroup)findViewById(R.id.et_radiogroup);
        male = (RadioButton)findViewById(R.id.et_radio_male);
        female = (RadioButton)findViewById(R.id.et_radio_female);
        submit = (Button)findViewById(R.id.btn_Submit);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if(male.isChecked() == true){

                    sgender = male.getText().toString();

                }
                else
                {
                    sgender = male.getText().toString();

                }



            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("Name",name.getText().toString());
                intent.putExtra("Age",age.getText().toString());
                intent.putExtra("Gender",sgender);
                intent.putExtra("CollegeName",clgname.getText().toString());

                startActivity(intent);

            }
        });




    }
}
