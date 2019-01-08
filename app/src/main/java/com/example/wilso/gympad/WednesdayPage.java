package com.example.wilso.gympad;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WednesdayPage extends AppCompatActivity {

    DatabaseHelper MONWORKOUTDb;
    private Button addMonday;
    private Button btnViewMonday;
    private Button updateMonday;
    private Button deleteMond;
    private Button mondayBotBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday_page);
        MONWORKOUTDb = new DatabaseHelper(this);
        btnViewMonday = (Button) findViewById(R.id.btnViewMonday);
        addMonday = (Button) findViewById(R.id.addMonday);
        updateMonday = (Button) findViewById(R.id.updateMon);
        deleteMond = (Button) findViewById(R.id.deleteMonday);
        mondayBotBar = (Button) findViewById(R.id.mondayBotBar);
        updateMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWedEditPage();
            }
        });
        deleteMond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWedDeletePage();
            }
        });
        addMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWedAddPage();
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

    public void openWedDeletePage(){
        Intent intent = new Intent(WednesdayPage.this, WednesdayDelete.class);
        startActivity(intent);
    }

    public void openWedEditPage(){
        Intent intent = new Intent(WednesdayPage.this, WednesdayEdit.class);
        startActivity(intent);
    }
    public void openWedAddPage() {
        Intent intent = new Intent(WednesdayPage.this, WednesdayAdd.class);
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
                Cursor data = MONWORKOUTDb.showWedData();

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
