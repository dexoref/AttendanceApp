package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

}
