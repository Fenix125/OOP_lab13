package com.example.lab13.task1;

public class FacebookUserAdapter implements User{
    private final FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }
    @Override
    public long getTime() {
        return facebookUser.getUserAciveTimel();
    }
    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

}
