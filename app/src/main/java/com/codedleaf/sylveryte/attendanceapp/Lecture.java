package com.codedleaf.sylveryte.attendanceapp;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Lecture {
    private String mLectureName;
    private int mStudentStartingRollNo;
    private int mStudentLastRollNo;
    private Klass mKlass;
    public Lecture(String lectureName,Klass klass,int studentStartingRollNo,int studentLastRollNo)
    {
        mKlass=klass;
        mStudentStartingRollNo=studentStartingRollNo;
        mStudentLastRollNo=studentLastRollNo;
        mLectureName=lectureName;
    }

    public String getLectureName() {
        return mLectureName;
    }

    public void setLectureName(String lectureName) {
        mLectureName = lectureName;
    }

    public int getStudentStartingRollNo() {
        return mStudentStartingRollNo;
    }

    public void setStudentStartingRollNo(int studentStartingRollNo) {
        mStudentStartingRollNo = studentStartingRollNo;
    }

    public int getStudentLastRollNo() {
        return mStudentLastRollNo;
    }

    public void setStudentLastRollNo(int studentLastRollNo) {
        mStudentLastRollNo = studentLastRollNo;
    }
}
