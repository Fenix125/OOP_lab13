package com.example.lab13.task1;

import java.time.Instant;

public class MessageSender {
    public void send(String text, User user, String country){
        if (user.getCountry().equals(country)){
            long currtime = Instant.now().toEpochMilli();
            long hourAgo = currtime - (3600 * 1000);
            if (user.getTime() >=  hourAgo){
                System.out.println("SENT (User was active last hour)");
            }
            else{
                System.out.println("NOT SENT (User has been inactive for more than one hour)");
            }
        }
    }
}
