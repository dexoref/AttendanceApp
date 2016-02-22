package com.codedleaf.sylveryte.attendanceapp;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.codedleaf.sylveryte.attendanceapp.DatabaseSchemas.KlassTable.Cols;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class KlassLab {

    private static KlassLab sKlassLab;
    private  List<Klass> mKlasses;
    private SQLiteDatabase mDatabase;

    public static KlassLab get()
    {
        if(sKlassLab ==null)
        {
            sKlassLab =new KlassLab();
        }
        return sKlassLab;

        //cleanup
    }

    private KlassLab()
    {
        mDatabase=DatabaseLab.getDatabase();

        mKlasses =new ArrayList<>();

    }

    private static ContentValues getContentValues(Klass klass) {
        ContentValues values=new ContentValues();

        values.put(Cols.KLASS_NAME,klass.getKlassName());
        values.put(Cols.ID,klass.getId().toString());
        values.put(Cols.NUM_OF_STUDENTS,klass.getNumOfStudents());

        return values;
    }

    public void addKlass(String klassName, int num) {
        mKlasses.add(new Klass(klassName,num));
    }

    public List<Klass> getKlasses() {
        return mKlasses;
    }
}
