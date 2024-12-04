package com.example.lab13.task2;

public class BDAdapter {
    public final BD db;

    public BDAdapter(BD dB){
        db = dB;
    }

    public String getUserData(){
        return db.отриматиДаніКористувача();
    }
    public String getData(){
        return db.отриматиСтатистичніДані();
    }

}
