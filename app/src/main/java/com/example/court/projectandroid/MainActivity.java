package com.example.court.projectandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button button = findViewById(R.id.button_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Do something here with the button
            }
        });
    }
}
