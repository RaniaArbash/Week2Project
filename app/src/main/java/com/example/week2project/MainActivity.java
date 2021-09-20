package com.example.week2project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    String tag = "Week2Project";
    EditText num1Text;
    EditText num2Text;
    Button plusBut;
    Button timesBut;
    TextView resultText;
    Button dividBut;
Button minusBut;
    private Calculator myCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"in OnCreate");
        setContentView(R.layout.activity_main);
        resultText = (TextView) findViewById(R.id.resultText);
        num1Text = (EditText) findViewById(R.id.num1);
        num2Text = (EditText) findViewById(R.id.num2);
        timesBut = (Button) findViewById(R.id.timesbut);
        plusBut = (Button) findViewById(R.id.plusOp);
        minusBut = (Button) findViewById(R.id.minusOP);
     dividBut = (Button)findViewById(R.id.dividOP);
        timesBut.setOnClickListener(this);// what is this in Java
        plusBut.setOnClickListener(this);
        minusBut.setOnClickListener(this);
        dividBut.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        prepareForCalc(view);
    }


    void prepareForCalc(View view){
        String n1 = num1Text.getText().toString();
        String n2 = num2Text.getText().toString();
        String op = ((Button)view).getText().toString();
        myCalculator.calc(n1,n2,op);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"in onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        myCalculator = new Calculator();
        Log.d(tag,"in onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"in onDestroy");
    }



}