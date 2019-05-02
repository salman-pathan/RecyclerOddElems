package com.demo.recycleroddelems;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UserRepository userRepository = new UserRepository();
        List<UserRepository.User> users = userRepository.getAllUsers();

        for (UserRepository.User user : users) {
            Log.d(TAG, String.format("onCreate ID : %d, Name : %s", user.getId(), user.getName()));
        }

    }
}
