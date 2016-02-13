package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class AttendanceLab {
    private static AttendanceLab mAttendanceLab;
    private static List<Attendance> mAttendances;

    public static AttendanceLab get(Context context)
    {
        if(mAttendanceLab==null)
        {
            mAttendanceLab=new AttendanceLab(context);
        }
        return mAttendanceLab;
    }

    private  AttendanceLab(Context context)
    {

        //delete it later
        mAttendances=new ArrayList<>();
        mAttendances.add(new Attendance(LectureLab.get().getLectures().get(0)));

    }

    public List<Attendance> getAttendances()
    {
        return mAttendances;
    }

}
