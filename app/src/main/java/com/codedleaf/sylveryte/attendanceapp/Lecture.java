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
        this(lectureName,klass,studentStartingRollNo,studentLastRollNo,remarks,UUID.randomUUID());
    }


    public Lecture(String lectureName,Klass klass,int studentStartingRollNo,
                   int studentLastRollNo,String remarks,UUID id) {
        mKlass = klass;
        mStudentStartingRollNo = studentStartingRollNo;
        mStudentLastRollNo = studentLastRollNo;
        mLectureName = lectureName;
        mRemarks = remarks;
        mId=id;
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

    public int getStudentStartingRollNo() {
        return mStudentStartingRollNo;
    }


    public int getStudentLastRollNo() {
        return mStudentLastRollNo;
    }
}
