package com.example.lab13.task1;

public class TwitterUserAdapter implements User{
    private final TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }
    @Override
    public long getTime() {
        return twitterUser.getLastAciveTimel();
    }
    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }
    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

}
