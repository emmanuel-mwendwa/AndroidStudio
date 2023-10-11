package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        EditText txtFirstName = findViewById(R.id.editTextFirstName);
        EditText txtLastName = findViewById(R.id.editTextLastName);
        EditText txtEmail = findViewById(R.id.editTextEmail);

        TextView txtFName = findViewById(R.id.textViewFirstName);
        TextView txtLName = findViewById(R.id.textViewLastName);
        TextView txtMail = findViewById(R.id.textViewEmail);

        txtFName.setText("First Name: " + txtFirstName.getText().toString());
        txtLName.setText("Last Name: " + txtLastName.getText().toString());
        txtMail.setText("Email: " + txtEmail.getText().toString());
    }
}
