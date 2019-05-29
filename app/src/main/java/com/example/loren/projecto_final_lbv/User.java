package com.example.loren.projecto_final_lbv;

public class User {

    String Name, Surname, TelNo, Email, Username, Password;

    public User (String Name, String Surname, String TelNo,String  Email, String Username, String Password){
        this.Name = Name;
        this.Surname = Surname;
        this.TelNo = TelNo;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;

    }

    public User(String username, String password){
        this.Name = "";
        this.Surname = "";
        this.TelNo = "";
        this.Email = "";
        this.Username = Username;
        this.Password = Password;
    }
}
