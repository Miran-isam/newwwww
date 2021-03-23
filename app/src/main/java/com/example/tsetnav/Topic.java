package com.example.tsetnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tsetnav.CreatePost;
import com.example.tsetnav.MainActivity;
import com.example.tsetnav.Menu;
import com.example.tsetnav.Notification;
import com.example.tsetnav.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Topic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_layout);
        BottomNavigationView BttomnavigationView =findViewById(R.id.bottom_navigation);
        BttomnavigationView.setSelectedItemId(R.id.topic);
        BttomnavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeIcon:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.question:
                        startActivity(new Intent(getApplicationContext(), CreatePost.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.topic:

                        return true;
                    case R.id.notifications:
                        startActivity(new Intent(getApplicationContext(), Notification.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.menu:
                        startActivity(new Intent(getApplicationContext(), Menu.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}