package com.example.loren.projecto_final_lbv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {


    Button bRegister;
    EditText idName, idSurname, idTelNo, idEmail, idUsername, idPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        idName = (EditText) findViewById(R.id.idName);
        idSurname = (EditText) findViewById(R.id.idSurname);
        idTelNo = (EditText) findViewById(R.id.idTelNo);
        idEmail = (EditText) findViewById(R.id.idEmail);
        idUsername = (EditText) findViewById(R.id.idUsername);
        idPassword = (EditText) findViewById(R.id.idPassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bRegister:

                String Name = idName.getText().toString();
                String Surname = idSurname.getText().toString();
                String TelNo = idTelNo.getText().toString();
                String Email = idEmail.getText().toString();
                String Username = idUsername.getText().toString();
                String Password = idPassword.getText().toString();

                User registeredData = new User(Name, Surname, TelNo, Email, Username, Password);

                startActivity(new Intent(this, MainActivity.class));

                break;
        }
    }
}
