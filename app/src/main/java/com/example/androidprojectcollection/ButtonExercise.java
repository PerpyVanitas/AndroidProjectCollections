package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class ButtonExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        Button btnClose;
        Button btnToast;
        Button btnDisappear;
        Button btnChangeBG;
        Button btnChangeBtnBG;
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.Layout);



        btnClose= (Button) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        btnToast = (Button) findViewById(R.id.btnToast2);
        btnToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "TOASTYYYY",Toast.LENGTH_LONG).show();
            }
        });

        btnDisappear = (Button) findViewById(R.id.btnDisappear);
        btnDisappear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                btnDisappear.setVisibility(View.GONE);
            }
        });

        btnChangeBG= (Button) findViewById(R.id.btnChangeBG);
        btnChangeBG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                layout.setBackgroundColor(Color.BLACK);
            }
        });

        btnChangeBtnBG= (Button) findViewById(R.id.btnChangeBtnBG);
        btnChangeBtnBG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                btnChangeBtnBG.setBackgroundColor(Color.RED);
            }
        });

    }


}