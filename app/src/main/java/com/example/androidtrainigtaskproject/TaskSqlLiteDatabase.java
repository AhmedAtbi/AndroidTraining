package com.example.androidtrainigtaskproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TaskSqlLiteDatabase extends SQLiteOpenHelper {
//constructeur
    // donner le context
    //le nom de la base
    // le curseur pour mapping de la base
    // version de la base de donnee


    public TaskSqlLiteDatabase(@Nullable Context context) {
        super(context, "db_task", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE tasks (id integer PRIMARY KEY,tasktitle varchar(255),taskdesc varchar(255),taskcolor integer)";
        db.execSQL(create);

    }

    
    //verification de la version de la base de données
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                    //delete oldBase
                    //Create db => create tables
        String delete = "DROP DATABASE IF EXISTS db_task";
        db.execSQL(delete);

    }

    public void ShowTask(){
        SQLiteDatabase db_task = getReadableDatabase();

        db_task.execSQL("SELECT * FROM tasks");
    }

    public void CreateTask(Task task)
    {   // appel de la base
        SQLiteDatabase db_task = getWritableDatabase();
        ContentValues data = new ContentValues();
        // data.put("Column Name",value)
        data.put("tasktitle",task.getTitle());
        data.put("taskdesc",task.getDesc());
        data.put("taskcolor",task.getColor());
        db_task.insert("tasks",null,data);


    }

}
