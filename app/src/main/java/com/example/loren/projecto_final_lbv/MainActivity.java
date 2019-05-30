package com.example.loren.projecto_final_lbv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    EditText idName, idSurname, idTelNo, idEmail, idUsername, idPassword;
    UserLocalStore userLocalStore;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, User_Profile.class);
                startActivity(intent);
            }
        });


        idName = findViewById(R.id.idName);
        idSurname = findViewById(R.id.idSurname);
        idTelNo = findViewById(R.id.idTelNo);
        idEmail = findViewById(R.id.idEmail);
        idUsername = findViewById(R.id.idUsername);
        idPassword = findViewById(R.id.idPassword);
        userLocalStore = new UserLocalStore(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
   // public native String stringFromJNI();

//    protected void onStart(){
//        super.onStart();
//        if (authenticate() == true){
//            displayUserDetails();
//        }else{
//            startActivity(new Intent(MainActivity.this, Login.class));
//        }
//    }

//    private boolean authenticate(){
//        return userLocalStore.getUserLoggedIn();
//    }
//
//    private void displayUserDetails(){
//        User user = userLocalStore.getLoggedInUser();
//        idName.setText("Welcome" + user.Name);
//        idName.setText(user.Username);
//    }

}
