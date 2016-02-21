package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class AttendanceLab {
    private static AttendanceLab mAttendanceLab;
    private  List<Attendance> mAttendances;

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

        //delete it later
        mAttendances=new ArrayList<>();

    }

    public void addAttendance(Attendance attendance)
    {
        mAttendances.add(attendance);
    }

    public List<Attendance> getAttendances()
    {
        return mAttendances;
    }

}
