package com.kk.kklive.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *
 */

public class DBHelper extends SQLiteOpenHelper{
    //建库
    public DBHelper(Context context) {
        super(context, "kklive.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //建表
        String sql="create table user(_id integer primary key autoincrement,username varchar(20),userphone varchar(20),userpwd varchar(20))";
        sqLiteDatabase.execSQL(sql);
        String sql2="create table anchor(_id integer primary key autoincrement,type varchar(20),userid varchar(20) unique)";
        sqLiteDatabase.execSQL(sql2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
