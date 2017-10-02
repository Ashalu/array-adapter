package com.developer.aashish.arrayadapter;

import java.util.ArrayList;

/**
 * Created by Aashish on 10/2/2017.
 */

public class User {
    private String name;
    private String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    //retrieve user's name
    public String getName(){
        return name;
    }

    //retrieve users' hometown
    public String getHometown(){
        return hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("prasant sr", "Maharastra"));
        users.add(new User("Himanshu", "Kanpur"));
        users.add(new User("Sarah", "Lucknow"));
        return users;
    }
}

