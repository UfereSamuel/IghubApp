package com.example.sammy.androidclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sammy on 10/12/18.
 */

public class Login extends AppCompatActivity {

    //Declaring Global variables
    EditText etMail;
    EditText etPassword;
    Button btnLogin;
    TextView tvNotRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        etMail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        tvNotRegistered = (TextView) findViewById(R.id.tvNotRegistered);

        tvNotRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the same
                //the method moves us from the login class to registration class
                startActivity(new Intent(Login.this, Registration.class));

//                //spageti code
//                Intent login = new Intent(Login.this, Registration.class);
//                startActivity(login);

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Typecasting from editText to String
                String email = etMail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (email.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Wrong email entered", Toast.LENGTH_LONG).show();
                    etMail.setError("Invalid email entered");
                } else if (password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "password cannot be empty", Toast.LENGTH_LONG).show();
                    etMail.setError("password cannot be empty");
                } else {
                    Toast.makeText(getApplicationContext(), "Successful!!!!!!", Toast.LENGTH_LONG).show();
                    etMail.setText("");
                    etPassword.setText("");
                }
            }
        });

    }


}
