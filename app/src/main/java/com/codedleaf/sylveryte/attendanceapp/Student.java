package com.codedleaf.sylveryte.attendanceapp;

import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Student {
    private String mName;
    private UUID mId;
    private int mRollNo;

    public Student(int rollNo)
    {
        mId=UUID.randomUUID();
        mRollNo=rollNo;
    }

    public int getRollNo() {
        return mRollNo;
    }

    public void setRollNo(int rollNo) {
        mRollNo = rollNo;
    }

    public UUID getId() {
        return mId;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
