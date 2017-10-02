package com.developer.aashish.arrayadapter;

import android.app.Activity;
import android.app.ListActivity;
import android.app.Notification;
import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends Activity
{

//    ArrayList<User> arrayOfUsers = User.getUsers();
    ArrayList<User> arrayOfUsers;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateUsersList();
    }




    private void populateUsersList() {
        // Construct the data source
        // Create the adapter to convert the array to views
        arrayOfUsers = new ArrayList<>(User.getUsers());
        CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}