package com.example.course.presentationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        //We set the toolbar to our toolbar from the layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Default button generated from the sample
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //here we receive the intent that was sent from the main activity
        Intent intent = getIntent();
        //we check that we received the name key
        if (intent.hasExtra("name")) {
            //if we did receive it, let's say hello by adding the text in a greet and adding it to the textview
            String helloText = "Hello " + intent.getStringExtra("name");
            ((TextView) findViewById(R.id.tv_hello)).setText(helloText);
        }

        //here we set our toolbar to take us back to the initial main activity when we go back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //used to set our toolbar's menu to the one we created in the resources
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_course, menu);
        return true;
    }

    //used to set the behaviour when clicking on a certain item in the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_info) {
            Toast.makeText(CourseActivity.this, "This is my Android Course", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
