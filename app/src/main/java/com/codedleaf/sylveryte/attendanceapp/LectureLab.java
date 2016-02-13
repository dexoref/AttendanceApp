package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class LectureLab {
    private static LectureLab mLectureLab;
    private static List<Klass> mLectures;

    public static LectureLab get(Context context)
    {
        if(mLectureLab==null)
        {
            mLectureLab=new LectureLab(context);
        }
        return mLectureLab;
    }

    private  LectureLab(Context context)
    {


    }
}
