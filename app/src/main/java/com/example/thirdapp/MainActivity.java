package com.example.thirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second, result;
    private Boolean isOperationClick;
    Operation operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;

            case R.id.btn_one:
                // нажал на один
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }

                // 12 + 21 = 33
                break;

            case R.id.btn_two:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;

            case R.id.btn_three:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;

            case R.id.btn_four:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;

            case R.id.btn_five:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;

            case R.id.btn_six:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;

            case R.id.btn_seven:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;


            case R.id.btn_clear:
                // нажал на очистить
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.PLUS;
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.MINUS;

                break;
            case R.id.btn_division:
                operation = Operation.DIVISION;

                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_multiplication:
                operation = Operation.MULTIPLICATION;
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.btn_equal:
                if (operation == Operation.PLUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first + second;
                    textView.setText(result.toString());
                } else if (operation == Operation.MINUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first - second;
                    textView.setText(result.toString());
                } else if (operation == Operation.DIVISION) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first / second;
                    textView.setText(result.toString());
                } else if (operation == Operation.MULTIPLICATION) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first * second;
                    textView.setText(result.toString());
                }
                break;
        }
        isOperationClick = true;
    }
}