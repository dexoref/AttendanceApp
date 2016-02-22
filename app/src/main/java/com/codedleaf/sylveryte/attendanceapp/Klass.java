package com.codedleaf.sylveryte.attendanceapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Klass {
    private String mKlassName;
    private List<Student> mStudents;
    private int mNumOfStudents;
    private UUID mId;

    public Klass(String klassName,int numOfStudents)
    {
        this(klassName,numOfStudents,UUID.randomUUID());

    }

    public Klass(String klassName, int numOfStudents, UUID id)
    {
        mKlassName = klassName;
        mStudents=new ArrayList<>();
        mNumOfStudents=numOfStudents;
        mId=id;
        for (int i=1;i<=numOfStudents;i++)
        {
            mStudents.add(new Student(i));
        }
    }

    public String getKlassName() {
        return mKlassName;
    }

    public void setKlassName(String klassName) {
        mKlassName = klassName;
    }

    public List<Student> getStudents() {
        return mStudents;
    }

    public List<Student> getSpecificStudents(int start,int end) {

        start-=1;
        end-=1;
        List<Student> specificList=new ArrayList<>();
        for (int i=start;i<=end;i++)
        {
            Student student=mStudents.get(i);
            specificList.add( new Student(student.getRollNo()));
        }
        return specificList;
    }

    public void setStudents(List<Student> students) {
        mStudents = students;
    }

    public int getNumOfStudents() {
        return mNumOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        mNumOfStudents = numOfStudents;
    }
}
