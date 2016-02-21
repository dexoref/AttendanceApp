package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class LectureLab {
    private static LectureLab mLectureLab;
    private  List<Lecture> mLectures;

    public static LectureLab get()
    {
        if(mLectureLab==null)
        {
            mLectureLab=new LectureLab();
        }
        return mLectureLab;
    }

    private  LectureLab()
    {
        //delete it later
        mLectures=new ArrayList<>();

        mLectures.add(new Lecture("sdds",KlassLab.get().getKlasses().get(1),2,21,"a baych"));
        mLectures.add(new Lecture("dssd",KlassLab.get().getKlasses().get(2),4,24,"b baych"));

    }

    public void add(String name,Klass klass, int startRollNO, int lastRollNo,String remarks) {
        Lecture lecture=new Lecture(name,klass,startRollNO,lastRollNo,remarks);
        mLectures.add(lecture);
    }


    public Lecture getLectureById(UUID uuid)
    {
        for (Lecture lecture: mLectures) {
            if (uuid.equals(lecture.getId()))
            {
                return lecture;
            }
        }
        return null;
    }

    public List<Lecture> getLectures()
    {
        return mLectures;
    }

}
