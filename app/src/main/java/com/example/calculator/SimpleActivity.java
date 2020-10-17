package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public class SimpleActivity extends AppCompatActivity {

    final String[] textOne = new String[1];
    final String[] textTwo = new String[1];
    final String[] sign = new String[1];


    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        super.onRestoreInstanceState (savedInstanceState);
        textOne[0] = savedInstanceState.getString("textOne", "");
        textTwo[0] = savedInstanceState.getString("textTwo", "");
        sign[0] = savedInstanceState.getString("sign", "");
        display(textOne[0], sign[0], textTwo[0]);
    }

    @Override
    protected void onSaveInstanceState (@NonNull Bundle outState) {
        super.onSaveInstanceState (outState);
        outState.putString("textOne", textOne[0]);
        outState.putString("textTwo", textTwo[0]);
        outState.putString("sign", sign[0]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        Objects.requireNonNull(getSupportActionBar()).hide();

        textOne[0] = "";
        textTwo[0] = "";
        sign[0] = "";
        final Double[] numberOne = new Double[1];
        final Double[] numberTwo = new Double[1];
        final Double[] result = new Double[1];

        TextView display = (TextView) findViewById(R.id.display);
        display.setFreezesText(true);
        display.setText("");
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonDivision = (Button) findViewById(R.id.buttonDivision);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonSign = (Button) findViewById(R.id.buttonSign);
        Button buttonAC = (Button) findViewById(R.id.buttonAC);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonBack = (Button) findViewById(R.id.buttonBack);

        button0.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                    textOne[0]+= "0";
            }else{
                    textTwo[0]+= "0";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });

        button1.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "1";
            }else{
                textTwo[0]+= "1";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button2.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "2";
            }else{
                textTwo[0]+= "2";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button3.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "3";
            }else{
                textTwo[0]+= "3";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button4.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "4";
            }else{
                textTwo[0]+= "4";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button5.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "5";
            }else{
                textTwo[0]+= "5";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button6.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "6";
            }else{
                textTwo[0]+= "6";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button7.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "7";
            }else{
                textTwo[0]+= "7";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button8.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "8";
            }else{
                textTwo[0]+= "8";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        button9.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                textOne[0]+= "9";
            }else{
                textTwo[0]+= "9";
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        buttonPlus.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "+";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(SimpleActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonMinus.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "-";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(SimpleActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonDivision.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "/";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(SimpleActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonMultiply.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "*";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(SimpleActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonEquals.setOnClickListener(v -> {
            if(!(textOne[0].isEmpty()) & !(textTwo[0].isEmpty())) {
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    numberTwo[0] = Double.valueOf(textTwo[0]);
                    if (sign[0].contains("+")) {
                        result[0] = numberOne[0] + numberTwo[0];
                    }
                    if (sign[0].contains("-")) {
                        result[0] = numberOne[0] - numberTwo[0];
                    }
                    if (sign[0].contains("*")) {
                        result[0] = numberOne[0] * numberTwo[0];
                    }
                    if (sign[0].contains("/")) {
                        if(numberTwo[0] == 0){
                            throw new ArithmeticException("Do not divide by 0!");
                        }
                        result[0] = numberOne[0] / numberTwo[0];
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    sign[0] = "";
                    textTwo[0] = "";
                    textOne[0] = nf.format(result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    if(numberTwo[0] == 0){
                        Toast.makeText(SimpleActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(SimpleActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                    }
                }
            }else{
                Toast.makeText(SimpleActivity.this, "Equation not complete!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonDot.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                if(textOne[0].length() == 0){
                    textOne[0] = "0.";
                }else{
                    if(!(textOne[0].contains("."))) {
                        textOne[0] += ".";
                    }
                }
            }else{
                if(textTwo[0].length() == 0){
                    textTwo[0] = "0.";
                }else{
                    if(!(textTwo[0].contains("."))) {
                        textTwo[0] += ".";
                    }
                }
            }
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });

        buttonSign.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                if(textOne[0].length() > 0) {
                    if(textOne[0].startsWith("-")){
                        textOne[0] = textOne[0].substring(1);
                    }else {
                        textOne[0] = "-" + textOne[0];
                    }
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                }
            }else {
                if (textTwo[0].length() > 0) {
                    if (textTwo[0].startsWith("-")) {
                        textTwo[0] = textTwo[0].substring(1);
                    } else {
                        textTwo[0] = "-" + textTwo[0];
                    }
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                }
            }
        });
        buttonAC.setOnClickListener(v -> {
            textOne[0] = "";
            sign[0] = "";
            textTwo[0] = "";
            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });
        buttonClear.setOnClickListener(v -> {
            if(textOne[0].isEmpty()){
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else if(sign[0].isEmpty()){
                textOne[0] = "";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else if(textTwo[0].isEmpty()){
                sign[0]= "";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                textTwo[0] = "";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }

        });
        buttonBack.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                if(textOne[0].length() > 0) {
                    textOne[0] = textOne[0].substring(0, textOne[0].length() - 1);
                }
            }else{
                if(textTwo[0].length() > 0) {
                    textTwo[0] = textTwo[0].substring(0, textTwo[0].length() - 1);
                }
            }

            display.setText(display(textOne[0], sign[0], textTwo[0]));
        });


    }

    public String display(String number1, String sign, String number2){
        if(number1.isEmpty() & sign.isEmpty() & number2.isEmpty()){
            return "";
        }

        if(!number1.isEmpty() & sign.isEmpty() & number2.isEmpty()){
            return number1;
        }

        if(!number1.isEmpty() & !sign.isEmpty() & number2.isEmpty()){
            return number1 + sign;
        }

        if(!number1.isEmpty() & !sign.isEmpty() & !number2.isEmpty()){
            return number1 + sign + number2;
        }

        return "";
    }
}