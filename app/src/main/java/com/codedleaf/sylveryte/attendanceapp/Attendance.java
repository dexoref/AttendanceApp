package com.codedleaf.sylveryte.attendanceapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Attendance {

    private Lecture mLecture;
    private List<Student> mStudents;
    private UUID mId;
    private Date mDate;

    public Attendance(Lecture lecture)
    {
        mLecture=lecture;
        mStudents=lecture.getKlass().getSpecificStudents(lecture.getStudentStartingRollNo(),
                lecture.getStudentLastRollNo());
        mId=UUID.randomUUID();
        mDate=new Date();

    }


    public List<Student> getStudents() {
        return mStudents;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public String getExtraInfo()
    {
        return "No of students "+mStudents.size()+"\nDate : "+mDate.toString();
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getAttendanceName()
    {
        return mLecture.getLectureName();
    }

}
