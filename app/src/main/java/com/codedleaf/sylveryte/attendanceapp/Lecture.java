package com.codedleaf.sylveryte.attendanceapp;

import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Lecture {
    private String mLectureName;
    private int mStudentStartingRollNo;
    private int mStudentLastRollNo;
    private Klass mKlass;
    private String mRemarks;
    private UUID mId;
    public Lecture(String lectureName,Klass klass,int studentStartingRollNo,int studentLastRollNo,String remarks)
    {
        mKlass=klass;
        mStudentStartingRollNo=studentStartingRollNo;
        mStudentLastRollNo=studentLastRollNo;
        mLectureName=lectureName;
        mRemarks=remarks;
        mId=UUID.randomUUID();
    }

    public String getLectureName() {
        return mLectureName;
    }

    public Klass getKlass() {
        return mKlass;
    }

    public UUID getId() {
        return mId;
    }

    public String getExtraInfo(){

        return mKlass.getKlassName()+" ("+mStudentStartingRollNo+
                "-"+mStudentLastRollNo+
                ") "+mRemarks;


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
