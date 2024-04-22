package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PassingIntentsExercise extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);
        Button btnSubmitForm = findViewById(R.id.btnSubmitForm);
        Button btnClearForm = findViewById(R.id.btnClearForm);

        EditText etFirstname = findViewById(R.id.etFirstname);

        EditText etLastname = findViewById(R.id.etLastname);
        RadioGroup rgGender = findViewById(R.id.rgGender);
        RadioButton rbMale = findViewById(R.id.rbMale);
        RadioButton rbFemale = findViewById(R.id.rbFemale);
        RadioButton rbOthers = findViewById(R.id.rbOthers);
        EditText etBirthdate = findViewById(R.id.etBirthdate);
        EditText etPhoneNum = findViewById(R.id.etPhoneNumber);
        EditText etEmail = findViewById(R.id.etEmailAddress);
        EditText etHomeAdd = findViewById(R.id.etHomeAddress);
        EditText etZip = findViewById(R.id.etZipCode);
        EditText etInsti = findViewById(R.id.etFormerInsti);
        EditText etStatus = findViewById(R.id.etCivilStatus);
        EditText etSiblings = findViewById(R.id.etSiblings);
      //  String gender = "unknown";

        btnClearForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rgGender.clearCheck();
                etFirstname.setText("");
                etLastname.setText("");
                etBirthdate.setText("");
                etPhoneNum.setText("");
                etEmail.setText("");
                etHomeAdd.setText("");
                etZip.setText("");
                etInsti.setText("");
                etStatus.setText("");
                etSiblings.setText("");
                etFirstname.setText("");

            }
        });

        btnSubmitForm.setOnClickListener(new View.OnClickListener() {
            String gender = "unknown";

            @Override
            public void onClick(View view) {
                if (rbMale.isChecked()){
                    gender = "Male";
                }else if (rbMale.isChecked()){
                    gender = "Female";
                }else if (rbMale.isChecked()){
                    gender = "Others";
                }else{
                    gender = "Unknown";
                }

                String Firstname = etFirstname.getText().toString();
                String Lastname = etLastname.getText().toString();
                String Birthdate = etBirthdate.getText().toString();
                String PhoneNum = etPhoneNum.getText().toString();
                String Email = etEmail.getText().toString();
                String HomeAdd = etHomeAdd.getText().toString();
                String Zip = etZip.getText().toString();
                String Insti = etInsti.getText().toString();
                String Status = etStatus.getText().toString();
                String Siblings = etSiblings.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key", Firstname);
                intent.putExtra("lname_key", Lastname);
                intent.putExtra("bdate_key", Birthdate);
                intent.putExtra("phone_key", PhoneNum);
                intent.putExtra("email_key", Email);
                intent.putExtra("add_key", HomeAdd);
                intent.putExtra("zip_key", Zip);
                intent.putExtra("insti_key", Insti);
                intent.putExtra("status_key", Status);
                intent.putExtra("sibling_key", Siblings);
                intent.putExtra("gender_key", gender);

                startActivity(intent);

            }
        });
    }
}