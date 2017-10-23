package com.silverkitten.reminderme;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SilverKitten on 10/23/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Data_User.db";
    public static final String TABLE_NAME = "Data_User_Table.db";

    public static final String COL_1="Nama";
    public static final String COL_2="Email";
    public static final String COL_3="Password";

    public DataBaseHelper (Context context){
        super(context,DATABASE_NAME,null,1);
        SQLiteDatabase db = this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE"+ TABLE_NAME + "(Nama TEXT, Email TEXT, Password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
    }

    public boolean insertData(String nama, String email, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,nama);
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,password);
        long result =db.insert(TABLE_NAME,null,contentValues);
        db.close();

        if (result==-1)
            return false;
        else
            return true;
    }
}
