package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String one;
    private String two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        resetUI();
    }
    @Override
    public void onRestart(){
        super.onRestart();
    }
    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.one)).setText(one);
        ((TextView) findViewById(R.id.two)).setText(two);
    }
    public void onClick(View view){
        EditText one = findViewById(R.id.one);
        EditText two = findViewById(R.id.two);
        String num_one = one.getText().toString();
        String num_two = two.getText().toString();

        if(num_one == "" | num_one == " "){
            num_one = "0";
        }
        if (num_two == "" | num_two == " "){
            num_two = "0";
        }
        int numder_one = Integer.parseInt(num_one);
        int numder_two = Integer.parseInt(num_two);
        int sum = numder_one + numder_two;
        Intent intent = new Intent(this, Second.class);
        intent.putExtra("num_one", numder_one);
        intent.putExtra("num_two", numder_two);
        intent.putExtra("sum", sum);
        startActivity(intent);
    }
}