package com.example.wilso.gympad;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SaturdayDelete extends AppCompatActivity {
    DatabaseHelper MONWORKOUT;
    EditText editName,editSets,editReps, editWeight, editID;
    Button btnAddData, btnUpdateData, btnDeleteData, botBar;
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday_delete);
        MONWORKOUT = new DatabaseHelper(this);

        editName = (EditText)findViewById(R.id.mondayInput1);
        editSets = (EditText)findViewById(R.id.mondayInput2);
        editReps = (EditText)findViewById(R.id.mondayInput3);
        editWeight = (EditText)findViewById(R.id.mondayInput4);
        editID = (EditText)findViewById(R.id.mondayInput5);
        botBar = (Button)findViewById(R.id.mondayAddBotBar);
        botBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
        btnAddData = (Button)findViewById(R.id.mondayAdd2Data);
        btnUpdateData = (Button)findViewById(R.id.updateMonBtn);
        btnDeleteData = (Button)findViewById(R.id.deleteBtn);

        deleteData();
        //viewData();

    }

    public void openHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void deleteData(){
        btnDeleteData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = editID.getText().toString().length();
                if(temp > 0){
                    int deleteRow = MONWORKOUT.deleteSatData(editID.getText().toString());
                    if(deleteRow > 0){
                        Toast.makeText(SaturdayDelete.this, "Successfully Deleted The Data!", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(SaturdayDelete.this, "Something went wrong :(.", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(SaturdayDelete.this, "You Must Enter An ID to Delete :(.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

