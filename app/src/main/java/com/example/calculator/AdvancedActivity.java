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


public class AdvancedActivity extends AppCompatActivity {

    String textOne = "";
    String textTwo = "";
    String sign = "";
    String nextOperation = "";
    Double numberOne;
    Double numberTwo;
    Double result;


    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        super.onRestoreInstanceState (savedInstanceState);
        textOne = savedInstanceState.getString("textOne", "");
        textTwo = savedInstanceState.getString("textTwo", "");
        sign = savedInstanceState.getString("sign", "");
        nextOperation = savedInstanceState.getString("nextOperation", "");
        display(textOne, sign, textTwo);
    }

    @Override
    protected void onSaveInstanceState (@NonNull Bundle outState) {
        super.onSaveInstanceState (outState);
        outState.putString("textOne", textOne);
        outState.putString("textTwo", textTwo);
        outState.putString("sign", sign);
        outState.putString("nextOperation", nextOperation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        Objects.requireNonNull(getSupportActionBar()).hide();

        textOne = "";
        textTwo = "";
        sign = "";
        nextOperation = "";


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
            if(sign.isEmpty()){
                textOne+= "0";
            }else{
                textTwo+= "0";
            }
            display.setText(display(textOne, sign, textTwo));
        });

        button1.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "1";
            }else{
                textTwo+= "1";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button2.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "2";
            }else{
                textTwo+= "2";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button3.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "3";
            }else{
                textTwo+= "3";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button4.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "4";
            }else{
                textTwo+= "4";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button5.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "5";
            }else{
                textTwo+= "5";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button6.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "6";
            }else{
                textTwo+= "6";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button7.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "7";
            }else{
                textTwo+= "7";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button8.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "8";
            }else{
                textTwo+= "8";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        button9.setOnClickListener(v -> {
            if(sign.isEmpty()){
                textOne+= "9";
            }else{
                textTwo+= "9";
            }
            display.setText(display(textOne, sign, textTwo));
        });
        buttonPlus.setOnClickListener(v -> {
            if(sign.isEmpty()){
                sign = "+";
                display.setText(display(textOne, sign, textTwo));
            }else if(!(textTwo.isEmpty())){
                nextOperation = "+";
                buttonEquals.performClick();
            }

        });
        buttonMinus.setOnClickListener(v -> {
            if(sign.isEmpty()){
                sign = "-";
                display.setText(display(textOne, sign, textTwo));
            }else if(!(textTwo.isEmpty())){
                nextOperation = "-";
                buttonEquals.performClick();
            }

        });
        buttonDivision.setOnClickListener(v -> {
            if(sign.isEmpty()){
                sign = "/";
                display.setText(display(textOne, sign, textTwo));
            }else if(!(textTwo.isEmpty())){
                nextOperation = "/";
                buttonEquals.performClick();
            }

        });
        buttonMultiply.setOnClickListener(v -> {
            if(sign.isEmpty()){
                sign = "*";
                display.setText(display(textOne, sign, textTwo));
            }else if(!(textTwo.isEmpty())){
                nextOperation = "*";
                buttonEquals.performClick();
            }

        });
        buttonEquals.setOnClickListener(v -> {
            if(!(textOne.isEmpty()) & !(textTwo.isEmpty())) {
                try {
                    numberOne = Double.valueOf(textOne);
                    numberTwo = Double.valueOf(textTwo);
                    if (sign.contains("+")) {
                        result = numberOne + numberTwo;
                    }
                    if (sign.contains("-")) {
                        result = numberOne - numberTwo;
                    }
                    if (sign.contains("*")) {
                        result = numberOne * numberTwo;
                    }
                    if (sign.contains("/")) {
                        if(numberTwo == 0){
                            throw new ArithmeticException("Do not divide by 0!");
                        }
                        result = numberOne / numberTwo;
                    }
                    if(sign.contains("^")) {
                        result = Math.pow(numberOne, numberTwo);
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    sign = "";
                    textTwo = "";
                    textOne = nf.format(result);
                    if(result.isNaN() | result.isInfinite()) {
                        Toast.makeText(AdvancedActivity.this, "Error, invalid equation.", Toast.LENGTH_SHORT).show();
                        textOne = "";
                    }
                    if(!(nextOperation.isEmpty())){
                        sign = nextOperation;
                        nextOperation = "";
                    }
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    if(numberTwo == 0){
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
            if(sign.isEmpty()){
                if(textOne.length() == 0){
                    textOne = "0.";
                }else{
                    if(!(textOne.contains("."))) {
                        textOne += ".";
                    }
                }
            }else{
                if(textTwo.length() == 0){
                    textTwo = "0.";
                }else{
                    if(!(textTwo.contains("."))) {
                        textTwo += ".";
                    }
                }
            }
            display.setText(display(textOne, sign, textTwo));
        });
        buttonSign.setOnClickListener(v -> {
            if(sign.isEmpty()){
                if(textOne.length() > 0) {
                    if(textOne.startsWith("-")){
                        textOne = textOne.substring(1);
                    }else {
                        textOne = "-" + textOne;
                    }
                    display.setText(display(textOne, sign, textTwo));
                }
            }else {
                if (textTwo.length() > 0) {
                    if (textTwo.startsWith("-")) {
                        textTwo = textTwo.substring(1);
                    } else {
                        textTwo = "-" + textTwo;
                    }
                    display.setText(display(textOne, sign, textTwo));
                }
            }
        });
        buttonAC.setOnClickListener(v -> {
            textOne = "";
            sign = "";
            textTwo = "";
            display.setText(display(textOne, sign, textTwo));
        });
        buttonClear.setOnClickListener(v -> {
            if(textOne.isEmpty()){
                display.setText(display(textOne, sign, textTwo));
            }else if(sign.isEmpty()){
                textOne = "";
                display.setText(display(textOne, sign, textTwo));
            }else if(textTwo.isEmpty()){
                sign= "";
                display.setText(display(textOne, sign, textTwo));
            }else{
                textTwo = "";
                display.setText(display(textOne, sign, textTwo));
            }

        });
        buttonBack.setOnClickListener(v -> {
            if(sign.isEmpty()){
                if(textOne.length() > 0) {
                    textOne = textOne.substring(0, textOne.length() - 1);
                }
            }else{
                if(textTwo.length() > 0) {
                    textTwo = textTwo.substring(0, textTwo.length() - 1);
                }
            }
            display.setText(display(textOne, sign, textTwo));
        });
        buttonSqrt.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.sqrt(numberOne);
                    NumberFormat nf  = new DecimalFormat("#.######");
                    textOne = nf.format(result);
                    if(result.isNaN() | result.isInfinite()) {
                        Toast.makeText(AdvancedActivity.this, "Error, invalid equation.", Toast.LENGTH_SHORT).show();
                        textOne = "";
                    }
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                        Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonPow2.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.pow(numberOne, 2);
                    if(result.isNaN() | result.isInfinite()) {
                        result = 0.0;
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    textOne = nf.format(result);
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonLog.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.log10(numberOne);
                    NumberFormat nf  = new DecimalFormat("#.######");
                    textOne = nf.format(result);
                    if(result.isNaN() | result.isInfinite()) {
                        Toast.makeText(AdvancedActivity.this, "Error, invalid equation.", Toast.LENGTH_SHORT).show();
                        textOne = "";
                    }
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonLn.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.log(numberOne);
                    NumberFormat nf  = new DecimalFormat("#.######");
                    if(result.isNaN() | result.isInfinite()) {
                        Toast.makeText(AdvancedActivity.this, "Error, invalid equation.", Toast.LENGTH_SHORT).show();
                        textOne = "";
                    } else {
                        textOne = nf.format(result);
                    }
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonSin.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.sin(numberOne);
                    if(result.isNaN() | result.isInfinite()) {
                        result = 0.0;
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    textOne = nf.format(result);
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonCos.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.cos(numberOne);
                    if(result.isNaN() | result.isInfinite()) {
                        result = 0.0;
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    textOne = nf.format(result);
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonTan.setOnClickListener(v -> {
            if(!textOne.isEmpty() & sign.isEmpty() & textTwo.isEmpty()){
                try {
                    numberOne = Double.valueOf(textOne);
                    result = Math.tan(numberOne);
                    if(result.isNaN() | result.isInfinite()) {
                        result = 0.0;
                    }
                    NumberFormat nf  = new DecimalFormat("#.######");
                    textOne = nf.format(result);
                    display.setText(display(textOne, sign, textTwo));
                } catch (Exception e) {
                    Toast.makeText(AdvancedActivity.this, "Error while parsing values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonPowY.setOnClickListener(v -> {
            if(sign.isEmpty()){
                sign = "^";
                display.setText(display(textOne, sign, textTwo));
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