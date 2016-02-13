package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class KlassLab {

    private static KlassLab sKlassLab;
    private static List<Klass> sKlasses;

    public static KlassLab get(Context context)
    {
        if(sKlassLab ==null)
        {
            sKlassLab =new KlassLab(context);
        }
        return sKlassLab;
    }

    private KlassLab(Context context)
    {

        sKlasses =new ArrayList<>();
        for (int i=1; i<10;i++)
        {
            sKlasses.add(new Klass("Class " + i,i+100));
        }
    }

    public List<Klass> getKlasses() {
        return sKlasses;
    }
}
