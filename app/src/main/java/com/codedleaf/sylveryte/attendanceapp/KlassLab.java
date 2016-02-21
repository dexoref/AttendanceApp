package com.codedleaf.sylveryte.attendanceapp;


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

        //cleanup
    }

    private KlassLab()
    {
        mKlasses =new ArrayList<>();

        //clean up code
        mKlasses.add(new Klass("sda",43));
        mKlasses.add(new Klass("sdxcva",53));
        mKlasses.add(new Klass("sd43a",73));
    }

    public void addKlass(String klassName, int num) {
        mKlasses.add(new Klass(klassName,num));
    }

    public List<Klass> getKlasses() {
        return mKlasses;
    }
}
