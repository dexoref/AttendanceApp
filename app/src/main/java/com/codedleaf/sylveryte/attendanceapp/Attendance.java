package com.codedleaf.sylveryte.attendanceapp;

import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Attendance {

    Lecture mLecture;

    public Attendance(Lecture lecture)
    {
        mLecture=lecture;
    }

    public int getAttendanceStudents()
    {
        return mLecture.getStudentLastRollNo();
    }

    public String getAttendanceName()
    {
        return mLecture.getLectureName();
    }
}
