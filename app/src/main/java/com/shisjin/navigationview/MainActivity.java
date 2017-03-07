package com.shisjin.navigationview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import org.sang.a9_1drawerlayoutnavigationview.R;

public class MainActivity extends AppCompatActivity {

    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nv = ((NavigationView) findViewById(R.id.navigation_view));
        nv.setItemIconTintList(null);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.m1:
                        Toast.makeText(MainActivity.this, "m1", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}
