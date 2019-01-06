package com.example.wilso.gympad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "MONWORKOUT.db";
    public static final String TABLE_NAME = "MONDAY_table";
    public static final String TABLE_NAME1 = "TUESDAY_table";
    public static final String TABLE_NAME2 = "WEDNESDAY_table";
    public static final String TABLE_NAME3 = "THURSDAY_table";
    public static final String TABLE_NAME4 = "FRIDAY_table";
    public static final String TABLE_NAME5 = "SATURDAY_table";
    public static final String TABLE_NAME6 = "SUNDAY_table";


    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "SETS";
    public static final String COL_4 = "REPS";
    public static final String COL_5 = "WEIGHT";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";
        String createTable1 = "CREATE TABLE " + TABLE_NAME1 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";
        String createTable2 = "CREATE TABLE " + TABLE_NAME2 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";
        String createTable3 = "CREATE TABLE " + TABLE_NAME3 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";
        String createTable4 = "CREATE TABLE " + TABLE_NAME4 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";
        String createTable5 = "CREATE TABLE " + TABLE_NAME5 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";
        String createTable6 = "CREATE TABLE " + TABLE_NAME6 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NAME TEXT, SETS TEXT, REPS TEXT, WEIGHT TEXT)";

        db.execSQL(createTable);
        db.execSQL(createTable1);
        db.execSQL(createTable2);
        db.execSQL(createTable3);
        db.execSQL(createTable4);
        db.execSQL(createTable5);
        db.execSQL(createTable6);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME4);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME5);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME6);
        onCreate(db);
    }



    //Monday Part
    public boolean insertMonData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showMonData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }
    public boolean updateMonData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteMonData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
    }

    //Tuesday Data
    public boolean insertTuesData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME1,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showTuesData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME1, null);
        return data;
    }
    public boolean updateTuesData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME1, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteTuesData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME1, "ID = ?", new String[] {id});
    }


    //Wednesday Data


    public boolean insertWedData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME2,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showWedData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME2, null);
        return data;
    }
    public boolean updateWedData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME2, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteWedData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME2, "ID = ?", new String[] {id});
    }

    //Thurday Data

    public boolean insertThursData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME3,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showThursData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME3, null);
        return data;
    }
    public boolean updateThursData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME3, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteThursData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME3, "ID = ?", new String[] {id});
    }

    // Friday Data

    public boolean insertFriData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME4,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showFriData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME4, null);
        return data;
    }
    public boolean updateFriData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME4, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteFriData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME4, "ID = ?", new String[] {id});
    }

    // Saturday Data

    public boolean insertSatData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME5,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showSatData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME5, null);
        return data;
    }
    public boolean updateSatData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME5, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteSatData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME5, "ID = ?", new String[] {id});
    }

    //Sunday Data

    public boolean insertSunData(String name,String sets,String reps, String weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        long result = db.insert(TABLE_NAME6,null ,contentValues);
        if(result == -1) {
            return false;
        }else {
            return true;
        }
    }

    public Cursor showSunData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME6, null);
        return data;
    }
    public boolean updateSunData(String id, String name, String sets, String reps, String weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,sets);
        contentValues.put(COL_4,reps);
        contentValues.put(COL_5,weight);
        db.update(TABLE_NAME6, contentValues, "ID = ?", new String[] {id});
        return true;
    }
    public Integer deleteSunData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME6, "ID = ?", new String[] {id});
    }
}
