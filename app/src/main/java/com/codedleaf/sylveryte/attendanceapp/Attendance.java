package com.codedleaf.sylveryte.attendanceapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Attendance {

    Lecture mLecture;
    private List<Student> mStudents;

    public Attendance(Lecture lecture)
    {
        mLecture=lecture;
        mStudents=lecture.getKlass().getSpecificStudents(lecture.getStudentStartingRollNo(),
                lecture.getStudentLastRollNo());

    }

    public int getAttendanceStudents()
    {
        return mLecture.getStudentLastRollNo();
    }

    public List<Student> getStudents() {
        return mStudents;
    }

    public String getAttendanceName()
    {
        return mLecture.getLectureName();
    }

}
