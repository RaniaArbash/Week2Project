package com.example.week2project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tag = "Week2Project";
    EditText num1Text;
    EditText num2Text;
    Button plusBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"in OnCreate");
        setContentView(R.layout.activity_main);

        num1Text = (EditText) findViewById(R.id.num1);
        num2Text = (EditText) findViewById(R.id.num2);

        plusBut = (Button) findViewById(R.id.plusOp);
        plusBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(num1Text.getText().toString() ) + Integer.parseInt(num2Text.getText().toString() );
                Log.d("Result is " , ""+result);
            }
        });
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