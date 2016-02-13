package com.codedleaf.sylveryte.attendanceapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Klass {
    private String mKlassName;
    private List<Student> mStudents;
    private int mNumOfStudents;

    public Klass(String klassName,int numOfStudents)
    {
        mKlassName = klassName;
        mStudents=new ArrayList<>();
        mNumOfStudents=numOfStudents;
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
