package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;


public class AdvancedActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_advanced);
        Objects.requireNonNull(getSupportActionBar()).hide();

        textOne[0] = "";
        textTwo[0] = "";
        sign[0] = "";
        final Double[] numberOne = new Double[1];
        final Double[] numberTwo = new Double[1];
        final Double[] result = new Double[1];

        TextView display = findViewById(R.id.display);
        display.setFreezesText(true);
        display.setText("");
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonEquals = findViewById(R.id.buttonEquals);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonSign = findViewById(R.id.buttonSign);
        Button buttonAC = findViewById(R.id.buttonAC);
        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonBack = findViewById(R.id.buttonBack);
        Button buttonSqrt = findViewById(R.id.buttonSqrt);
        Button buttonPowY = findViewById(R.id.buttonPowy);
        Button buttonPow2 = findViewById(R.id.buttonPow2);
        Button buttonLog = findViewById(R.id.buttonLog);
        Button buttonSin = findViewById(R.id.buttonSin);
        Button buttonCos = findViewById(R.id.buttonCos);
        Button buttonTan = findViewById(R.id.buttonTan);
        Button buttonLn = findViewById(R.id.buttonLn);



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
                Toast.makeText(AdvancedActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonMinus.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "-";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(AdvancedActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonDivision.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "/";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(AdvancedActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }

        });
        buttonMultiply.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "*";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(AdvancedActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
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
                    if(sign[0].contains("^")) {
                        result[0] = Math.pow(numberOne[0], numberTwo[0]);
                    }
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    sign[0] = "";
                    textTwo[0] = "";
                    textOne[0] = nf.format(result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    if(numberTwo[0] == 0){
                        Toast.makeText(AdvancedActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                    }
                }
            }else{
                Toast.makeText(AdvancedActivity.this, "Equation not complete!", Toast.LENGTH_SHORT).show();

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
        buttonSqrt.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.sqrt(numberOne[0]);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                        Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonPow2.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.pow(numberOne[0], 2);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonLog.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.log10(numberOne[0]);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonLn.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.log(numberOne[0]);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonSin.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.sin(numberOne[0]);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonCos.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.cos(numberOne[0]);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonTan.setOnClickListener(v -> {
            if(!textOne[0].isEmpty() & sign[0].isEmpty() & textTwo[0].isEmpty()){
                try {
                    numberOne[0] = Double.valueOf(textOne[0]);
                    result[0] = Math.tan(numberOne[0]);
                    if(result[0].isNaN() | result[0].isInfinite()) {
                        result[0] = 0.0;
                    }
                    textOne[0] = String.format(Locale.ENGLISH,"%.6f", result[0]);
                    display.setText(display(textOne[0], sign[0], textTwo[0]));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonPowY.setOnClickListener(v -> {
            if(sign[0].isEmpty()){
                sign[0] = "^";
                display.setText(display(textOne[0], sign[0], textTwo[0]));
            }else{
                Toast.makeText(AdvancedActivity.this, "Operation already chosen!", Toast.LENGTH_SHORT).show();
            }
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