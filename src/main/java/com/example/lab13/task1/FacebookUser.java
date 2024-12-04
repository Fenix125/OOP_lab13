package com.example.lab13.task1;



public class FacebookUser {
    private String userEmail;
    private String country;
    private long lastTime;

    public FacebookUser(String userMail, String country, long lastTime){
        this.userEmail = userMail;
        this.country = country;
        this.lastTime = lastTime;
    }

    public String getEmail(){
        return userEmail;
    }
    public String getUserCountry(){
        return country;
    }
    public long getUserAciveTimel(){
        return lastTime;
    }
}
