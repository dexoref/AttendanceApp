package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

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

    }

    public List<Lecture> getLectures()
    {
        return mLectures;
    }

}
