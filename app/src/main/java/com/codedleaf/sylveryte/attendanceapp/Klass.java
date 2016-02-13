package com.codedleaf.sylveryte.attendanceapp;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Klass {
    private String mKlassName;

    public Klass(String klassName)
    {
        mKlassName = klassName;
    }

    public String getKlassName() {
        return mKlassName;
    }

    public void setKlassName(String klassName) {
        mKlassName = klassName;
    }
}
