package com.example.calculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState){
        int num_one = getIntent().getExtras().getInt("num_one");
        int num_two = getIntent().getExtras().getInt("num_two");
        int sum = getIntent().getExtras().getInt("sum");

        super.onCreate(saveInstanceState);
        setContentView(R.layout.second);
        TextView res = findViewById(R.id.second);

        String result;
        String str_one = Integer.toString(num_one);
        String str_two = Integer.toString(num_two);
        String str_sum = Integer.toString(sum);
        if (num_two < 0){
            str_two = "( " + num_two + " )";
        }
        result = str_one + " + " + str_two + " = " + str_sum;
        res.setText(result);
    }
}
