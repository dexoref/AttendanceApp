package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class SummaryActivity extends SingleFragmentActivity {

    public static final String FRAGMENT_CODE="Brains";

    public static Intent fetchIntent(Context context,UUID id)
    {
        Intent i=new Intent(context,SummaryActivity.class);
        i.putExtra(FRAGMENT_CODE,id);
        return i;
    }

    @Override
    protected Fragment createFragment() {
            return new SummaryFragment();

    }
}
