package com.jhonisaac.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private TextView screen;
    private String str1, str2, str3, str, sings, result;
    private double value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        screen = findViewById(R.id.result);
        str= "";
    }

    public void onClick (View v) {
        Button button = (Button) v;
        str+= button.getText().toString();
        screen.setText(str);
        value1 = Double.parseDouble(str);
    }

    public void onClickSings(View v) {
        Button button = (Button) v;
        sings = button.getText().toString();
        screen.setText(sings);
        str="";
    }

    public void erase (View v) {
        value1=0.0;
        value2=0.0;
        result=null;
    }

    public void clear (View v) {
        if (!screen.getText().toString().equals("")){
            screen.setText(screen.getText().subSequence(0, screen.getText().length()-1));
        }


    }

    public void calculate (View v) {
        Button button =(Button)v;
        str2 = screen.getText().toString();
        value2=Double.parseDouble(str2);

        if (sings.equals("+")) {
            result=value1+value2+"";
        }
        else if (sings.equals("-")){
            result=value1-value2+"";
        }
        else if (sings.equals("/")) {
            result=value1/value2+"";
        }
        else if (sings.equals("*")) {
            result=value1*value2+"";
        }
        else {
            screen.setText("E");
        }
        screen.setText(result);
    }
}
