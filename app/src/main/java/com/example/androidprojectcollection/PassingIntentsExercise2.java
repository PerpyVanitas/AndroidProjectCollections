package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        TextView Firstname = findViewById(R.id.txtFirstname);
        TextView Lastname = findViewById(R.id.txtLastname);
        TextView Gender = findViewById(R.id.txtGender);
        TextView Birthdate = findViewById(R.id.txtBirthdate);
        TextView Phone = findViewById(R.id.txtPhone);
        TextView Email = findViewById(R.id.txtEmail);
        TextView Home = findViewById(R.id.txtAddress);
        TextView Zip = findViewById(R.id.txtZip);
        TextView Insti = findViewById(R.id.txtInsti);
        TextView Status = findViewById(R.id.txtStatus);
        TextView Siblings = findViewById(R.id.txtSiblings);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String phone = intent.getStringExtra("phone_key");
        String email = intent.getStringExtra("email_key");
        String add = intent.getStringExtra("add_key");
        String zip = intent.getStringExtra("zip_key");
        String insti = intent.getStringExtra("insti_key");
        String status = intent.getStringExtra("status_key");
        String sibling = intent.getStringExtra("sibling_key");

        Firstname.setText(fname);
        Lastname.setText(lname);
        Gender.setText(gender);
        Birthdate.setText(bdate);
        Phone.setText(phone);
        Email.setText(email);
        Home.setText(add);
        Zip.setText(zip);
        Insti.setText(insti);
        Status.setText(status);
        Siblings.setText(sibling);

    }
}