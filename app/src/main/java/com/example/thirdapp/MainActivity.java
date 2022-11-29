package com.example.thirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second, result;
    private Boolean isOperationClick;
    Process process;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Button button = findViewById(R.id.bottom);
        button.setOnClickListener(view -> {
            intent.putExtra("key", result.toString());
            startActivity(intent);
        });
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
        ((Button) findViewById(R.id.bottom)).setVisibility(View.GONE);
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                process = Process.PLUS;
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                process = Process.MINUS;

                break;
            case R.id.btn_division:
                process = Process.DIVISION;

                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_multiplication:
                process = Process.MULTIPLICATION;
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.btn_equal:
                if (process == Process.PLUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first + second;
                    textView.setText(result.toString());
                } else if (process == Process.MINUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first - second;
                    textView.setText(result.toString());
                } else if (process == Process.DIVISION) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first / second;
                    textView.setText(result.toString());
                } else if (process == Process.MULTIPLICATION) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first * second;
                    textView.setText(result.toString());
                }
                ((Button) findViewById(R.id.bottom)).setVisibility(View.VISIBLE);
                break;
        }
        isOperationClick = true;

    }


}