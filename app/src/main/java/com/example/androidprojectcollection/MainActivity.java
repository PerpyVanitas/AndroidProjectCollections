package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;

    Button btn4;

    Button btn6;
    Button btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnLayoutExercise);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, LayoutExercise.class);
                startActivity(intent1);
            }
        });

        btn2 = (Button) findViewById(R.id.btnButtonExercise);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ButtonExercise.class);
                startActivity(intent2);
            }
        });

        btn3 = (Button) findViewById(R.id.btnCalc);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, CalculatorExercise.class);
                startActivity(intent3);
            }
        });

        btn4 = (Button) findViewById(R.id.btnConnect3);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, Connect3.class);
                startActivity(intent4);
            }
        });

        btn6 = (Button)findViewById(R.id.btnIntents);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent (MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent6);
            }
        });

        btn8 = (Button) findViewById(R.id.btnMenu);

        btn8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent (MainActivity.this, MenuExercise.class);
                startActivity(intent8);
            }
        }));

    }
}