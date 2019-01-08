package com.example.wilso.gympad;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MondayPage extends AppCompatActivity {

    DatabaseHelper MONWORKOUTDb;
    private Button addMonday;
    private Button btnViewMonday;
    private Button updateMonday;
    private Button deleteMond;
    private Button mondayBotBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday_page);

        MONWORKOUTDb = new DatabaseHelper(this);
        btnViewMonday = (Button) findViewById(R.id.btnViewMonday);
        addMonday = (Button) findViewById(R.id.addMonday);
        updateMonday = (Button) findViewById(R.id.updateMon);
        deleteMond = (Button) findViewById(R.id.deleteMonday);
        mondayBotBar = (Button) findViewById(R.id.mondayBotBar);



        updateMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMondayEditPage();
            }
        });
        deleteMond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMondayDeletePage();
            }
        });
        addMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMondayAddPage();
            }
        });
        mondayBotBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        ViewData();

    }

    public void openMondayDeletePage() {
        Intent intent = new Intent(MondayPage.this, MondayDelete.class);
        startActivity(intent);
    }

    public void openMondayAddPage() {
        Intent intent = new Intent(MondayPage.this, MondayAdd.class);
        startActivity(intent);
    }

    public void openMondayEditPage(){
        Intent intent = new Intent(MondayPage.this, MondayEdit.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ViewData() {
        btnViewMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor data = MONWORKOUTDb.showMonData();

                if (data.getCount() == 0) {
                    display("Error", "No Data Found.");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (data.moveToNext()) {
                    buffer.append("Exercise #: " + data.getString(0) + "\n");
                    buffer.append("Name: " + data.getString(1) + "\n");
                    buffer.append("Sets: " + data.getString(2) + "\n");
                    buffer.append("Reps: " + data.getString(3) + "\n");
                    buffer.append("Weight: " + data.getString(4) + "\n");
                    buffer.append("\n");


                }
                display("Your Workouts:", buffer.toString());
            }
        });

    }

    public void display(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }


}
