package com.jasmin.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber;
    EditText secondNumber;
    Button btnAdd, btnSub, btnMul, btnDiv;
    double num1, num2, res;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        btnAdd = (Button) findViewById(R.id.button1);
        result = (TextView) findViewById(R.id.result);
        // Addition
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double res = num1 + num2;
                result.setText(Double.toString(res));
            }
        });
        //Subtraction
        btnSub = (Button) findViewById(R.id.button2);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double res = num1 - num2;
                result.setText(Double.toString(res));
            }

        });
        // Multiplication
        btnMul = (Button) findViewById(R.id.button3);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double res = num1 * num2;
                result.setText(Double.toString(res));
            }
        });
        // Division
        btnDiv = (Button) findViewById(R.id.button4);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double res = num1 / num2;
                result.setText(Double.toString(res));
            }
        });

    }
}
