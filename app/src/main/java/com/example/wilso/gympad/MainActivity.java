package com.example.wilso.gympad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {





    private Button mondaybutton;
    private Button tuesdaybutton;
    private Button wednesdaybutton;
    private Button thursdaybutton;
    private Button fridaybutton;
    private Button saturdaybutton;
    private Button sundaybutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mondaybutton = (Button)findViewById(R.id.mondaybutton);
        mondaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMondayPage();
            }
        });

        tuesdaybutton = (Button) findViewById(R.id.tuesdaybutton);
        tuesdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTuesdayPage();
            }
        });

        wednesdaybutton = (Button) findViewById(R.id.wednesdaybutton);
        wednesdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWednesdayPage();
            }
        });

        thursdaybutton = (Button) findViewById(R.id.thursdaybutton);
        thursdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThursdayPage();
            }
        });

        fridaybutton = (Button) findViewById(R.id.fridaybutton);
        fridaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFridayPage();
            }
        });

        saturdaybutton = (Button) findViewById(R.id.saturdaybutton);
        saturdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaturdayPage();
            }
        });

        sundaybutton = (Button) findViewById(R.id.sundaybutton);
        sundaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSundayPage();
            }
        });





    }

    public void openMondayPage(){
        Intent intent = new Intent(this, MondayPage.class);
        startActivity(intent);
    }


    public void openTuesdayPage(){
        Intent intent = new Intent(this, TuesdayPage.class );
        startActivity(intent);
    }

    public void openWednesdayPage(){
        Intent intent = new Intent(this, WednesdayPage.class);
        startActivity(intent);
    }

    public void openThursdayPage(){
        Intent intent = new Intent(this, ThursdayPage.class);
        startActivity(intent);
    }

    public void openFridayPage(){
        Intent intent = new Intent(this, FridayPage.class);
        startActivity(intent);
    }

    public void openSaturdayPage(){
        Intent intent = new Intent(this, SaturdayPage.class);
        startActivity(intent);
    }

    public void openSundayPage(){
        Intent intent = new Intent(this, SundayPage.class);
        startActivity(intent);
    }



}
