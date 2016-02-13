package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by sylveryte on 13/2/16.
 */
public class AdditionActivity extends SingleFragmentActivity {

    private static final String FRAGMENT_CODE="dhaniyaCode";
    public static final int ADDKLASS=1;
    public static final int ADDLECTURE=2;

    public static Intent fetchIntent(Context context,int fragCode)
    {
        Intent i=new Intent(context,AdditionActivity.class);
        i.putExtra(FRAGMENT_CODE,fragCode);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        switch (getIntent().getIntExtra(FRAGMENT_CODE,0))
        {
            case ADDKLASS :{
                return new KlassAddFragment();
            }
            case ADDLECTURE:{
                return new LectureAddFragment();
            }
        }
        return null;
    }
}
