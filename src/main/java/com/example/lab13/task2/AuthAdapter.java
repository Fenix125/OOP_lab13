package com.example.lab13.task2;

public class AuthAdapter {
    private final Auth auth;

    public AuthAdapter(Auth Auth){
        auth = Auth;
    }
    public boolean auth(BDAdapter db){
        db.getUserData();
        return true;
    }
}
