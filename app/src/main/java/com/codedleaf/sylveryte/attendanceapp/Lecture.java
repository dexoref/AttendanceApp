package com.codedleaf.sylveryte.attendanceapp;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Lecture {
    private String mLectureName;
    private int mStudentStartingRollNo;
    private int mStudentLastRollNo;
    private String mKlassName;
    public Lecture(String lectureName,String klassName,int studentStartingRollNo,int studentLastRollNo)
    {
        mKlassName=klassName;
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

    public String getKlassName() {
        return mKlassName;
    }

    public void setKlassName(String klassName) {
        mKlassName = klassName;
    }
}
