package com.example.lab13.task1;

public class TwitterUser {
    private String userMail;
    private String country;
    private long lastTime;

    public TwitterUser(String userMail, String country, long lastTime){
        this.userMail = userMail;
        this.country = country;
        this.lastTime = lastTime;
    }

    public String getUserMail(){
        return userMail;
    }
    public String getCountry(){
        return country;
    }
    public long getLastAciveTimel(){
        return lastTime;
    }
}
