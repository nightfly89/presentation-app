package com.example.course.presentationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Here we set the layout for our activity
        setContentView(R.layout.activity_main);

        //On the start button click we go to the next activity!
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //In the intent to start a new activity we add our data: the key name with your name as a value
                startActivity(new Intent(MainActivity.this, CourseActivity.class).putExtra("name", "John"));
            }
        });
    }


}
