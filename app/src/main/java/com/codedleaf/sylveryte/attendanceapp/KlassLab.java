package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class KlassLab {

    private static KlassLab sKlassLab;
    private  List<Klass> mKlasses;

    public static KlassLab get()
    {
        if(sKlassLab ==null)
        {
            sKlassLab =new KlassLab();
        }
        return sKlassLab;
    }

    private KlassLab()
    {
        mKlasses =new ArrayList<>();
    }

    public void addKlass(String klassName, int num) {
        mKlasses.add(new Klass(klassName,num));
    }

    public List<Klass> getKlasses() {
        return mKlasses;
    }
}
