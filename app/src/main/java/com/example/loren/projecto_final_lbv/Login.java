package com.example.loren.projecto_final_lbv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {


    Button bLogin, bRegisterLink;
    EditText idUsername, idPassword;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idUsername = (EditText) findViewById(R.id.idUsername);
        idPassword = (EditText) findViewById(R.id.idPassword);
        bRegisterLink = (Button) findViewById(R.id.bRegisterLink);
        bLogin = (Button) findViewById(R.id.bLogin);
        bRegisterLink.setOnClickListener(this);
        bLogin.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLogin:
                User user = new User(null, null);
                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);

                startActivity(new Intent(this, MainActivity.class));

                break;

            case R.id.bRegisterLink:

                startActivity(new Intent(this, Register.class));

                break;

        }
    }
}
