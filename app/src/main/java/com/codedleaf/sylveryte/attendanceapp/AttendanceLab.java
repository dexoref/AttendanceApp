package com.codedleaf.sylveryte.attendanceapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.codedleaf.sylveryte.attendanceapp.DatabaseSchemas.AttendanceTable.Cols;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class AttendanceLab {
    private static AttendanceLab mAttendanceLab;
    private  List<Attendance> mAttendances;
    private SQLiteDatabase mDatabase;

    public static AttendanceLab get()
    {

        if(mAttendanceLab==null)
        {
            mAttendanceLab=new AttendanceLab();
        }
        return mAttendanceLab;
    }

    private  AttendanceLab()
    {

        mDatabase=DatabaseLab.getDatabase();

        mAttendances=new ArrayList<>();


    }

    public void addAttendance(Attendance attendance)
    {
        mAttendances.add(attendance);
    }

    public Attendance getAttendanceById(UUID uuid)
    {
        for (Attendance attendance: mAttendances) {
            if (uuid.equals(attendance.getId()))
            {
                return attendance;
            }
        }
        return null;
    }

    public List<Attendance> getAttendances()
    {
        return mAttendances;
    }

    private static ContentValues getContentValues(Attendance attendance) {
        ContentValues values = new ContentValues();

        values.put(Cols.ID,attendance.getId().toString());
        values.put(Cols.LECTURE_ID,attendance.getLectureId().toString());
        values.put(Cols.DATE,attendance.getDateString());
        values.put(Cols.PRESENT,
                SylveryteJoinSplit.getString(attendance.getStudents()));

        return values;
    }

}
