package com.example.loren.projecto_final_lbv;

import android.content.Context;
import android.content.SharedPreferences;

public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData (User user) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("Name", user.Name);
        spEditor.putString("Surname", user.Surname);
        spEditor.putString("TelNo", user.TelNo);
        spEditor.putString("Email", user.Email);
        spEditor.putString("Username", user.Username);
        spEditor.putString("Password", user.Password);
        spEditor.commit();
    }

    public User getLoggedInUser(){
        String Name = userLocalDatabase.getString("Name","");
        String Surname = userLocalDatabase.getString("Surname","");
        String TelNo = userLocalDatabase.getString("TelNo","");
        String Email = userLocalDatabase.getString("Email","");
        String Username = userLocalDatabase.getString("Username","");
        String Password = userLocalDatabase.getString("Password","");

        User storedUser = new User(Name, Surname, TelNo, Email, Username, Password);

        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn(){
        if (userLocalDatabase.getBoolean("loggedIn", false) == true){
            return true;
        }else{
            return false;
        }
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }



}

