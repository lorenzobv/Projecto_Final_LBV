package com.example.loren.projecto_final_lbv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class User_Profile extends AppCompatActivity implements View.OnClickListener{


    Button bSave, bCancel;
    EditText idName, idSurname, idTelNo, idEmail, idUsername, idPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__profile);


        idName = findViewById(R.id.idName);
        idSurname = findViewById(R.id.idSurname);
        idTelNo = findViewById(R.id.idTelNo);
        idEmail = findViewById(R.id.idEmail);
        idUsername = findViewById(R.id.idUsername);
        idPassword = findViewById(R.id.idPassword);
        bCancel = findViewById(R.id.bCancel);
        bSave = findViewById(R.id.bSave);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSave:

                startActivity(new Intent(this, MainActivity.class));

                break;

            case R.id.bCancel:

                startActivity(new Intent(this, MainActivity.class));

                break;

        }
    }
}
