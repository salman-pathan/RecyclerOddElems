package com.demo.recycleroddelems;

import android.annotation.SuppressLint;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    @SuppressLint("DefaultLocale")
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        User user;
        for (int i=1; i<51; i++) {
            user = new User(i, String.format("User %d", i));
            users.add(user);
        }

        return users;
    }

    public static class User {

        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

}
