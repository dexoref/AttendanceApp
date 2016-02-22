package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by sylveryte on 22/2/16.
 */


public class DatabaseLab{

    private Context mContext;
    private SQLiteDatabase mKlassDatabase;
    private SQLiteDatabase mLectureDatabase;
    private SQLiteDatabase mAttendanceDatabase;

    public DatabaseLab(Context context)
    {
        mContext=context.getApplicationContext();
    }


}
