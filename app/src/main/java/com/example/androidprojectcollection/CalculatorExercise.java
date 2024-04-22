package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorExercise extends AppCompatActivity {
    Calculator calculator = new Calculator();
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnPlus;
    Button btnMinus;
    Button btnDivision;
    Button btnMultiplication;
    Button btnEquals;
    Button btnClear;

    Button btnPeriod;

    EditText cont, cont2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);

        btn1 = findViewById(R.id.btnNum1);
        btn2 = findViewById(R.id.btnNum2);
        btn3 = findViewById(R.id.btnNum3);
        btn4 = findViewById(R.id.btnNum4);
        btn5 = findViewById(R.id.btnNum5);
        btn6 = findViewById(R.id.btnNum6);
        btn7 = findViewById(R.id.btnNum7);
        btn8 = findViewById(R.id.btnNum8);
        btn9 = findViewById(R.id.btnNum9);
        btn0 = findViewById(R.id.btnNum0);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivide);
        btnMultiplication = findViewById(R.id.btnMultiply);
        btnEquals = findViewById(R.id.btnEquals);
        btnClear = findViewById(R.id.btnClear);
        btnPeriod = findViewById(R.id.btnPeriod);
        cont = findViewById(R.id.cont);
        cont.setEnabled(false);
        cont2 = findViewById(R.id.cont2);
        cont2.setEnabled(false);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.append("0");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = cont.getText().toString();
                if (!content.isEmpty()) {
                    char lastChar = content.charAt(content.length() - 1);
                    if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '.') {
                        cont.setText(operationReplacement(content, "+"));
                    } else {
                        cont.append("+");
                    }
                    String result = String.valueOf(calculator.calculate(content));
                    cont2.setText(result);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = cont.getText().toString();
                if (!content.isEmpty()) {
                    char lastChar = content.charAt(content.length() - 1);
                    if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '.') {
                        cont.setText(operationReplacement(content, "-"));
                    } else {
                        cont.append("-");
                    }
                    String result = String.valueOf(calculator.calculate(content));
                    cont2.setText(result);
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = cont.getText().toString();
                if (!content.isEmpty()) {
                    char lastChar = content.charAt(content.length() - 1);
                    if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '.') {
                        cont.setText(operationReplacement(content, "*"));
                    } else {
                        cont.append("*");
                    }
                    String result = String.valueOf(calculator.calculate(content));
                    cont2.setText(result);
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = cont.getText().toString();
                if (!content.isEmpty()) {
                    char lastChar = content.charAt(content.length() - 1);
                    if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '.') {
                        cont.setText(operationReplacement(content, "/"));
                    } else {
                        cont.append("/");
                    }
                    String result = String.valueOf(calculator.calculate(content));
                    cont2.setText(result);
                }
            }
        });

        btnPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = cont.getText().toString();
                char lastChar = content.charAt(content.length() - 1);
                if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '.'){
                    cont.setText(operationReplacement(content, "."));
                } else {
                    cont.append(".");
                }
                String result = String.valueOf(calculator.calculate(content));
                cont2.setText(result);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.setText("");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = cont.getText().toString();
                String result = String.valueOf(calculator.mdasCalculate(content));
                cont2.setText(result);
                cont.setText("");
            }
        });

    }
    String operationReplacement(String currVal, String operator) {
        String s = currVal.substring(0, currVal.length() - 1) + operator;
        if (currVal.endsWith("+") ||
                currVal.endsWith("-") ||
                currVal.endsWith("*") ||
                currVal.endsWith("/")) {
            return s;
        } else {
            return currVal + operator;
        }
    }

    }







