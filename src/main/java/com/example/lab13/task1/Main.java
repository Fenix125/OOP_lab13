package com.example.lab13.task1;

public class Main {
    public static void main(String[] args) {
        TwitterUserAdapter user1 = new TwitterUserAdapter(new TwitterUser("meow@meow.meow", "125", 1733777275948L));
        FacebookUserAdapter user2 = new FacebookUserAdapter(new FacebookUser("xyz@zxc.ghoul", "126", 33777275948L));
    
        MessageSender sender = new MessageSender();
        sender.send("Hi", user1, "125");
        sender.send("Bye", user2, "126");
    }
}
