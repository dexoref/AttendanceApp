package com.codedleaf.sylveryte.attendanceapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class LectureAddFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.add_lecture_fragment,container,false);
        EditText editTextLectureName=(EditText)view.findViewById(R.id.editTextLectureName);
        Spinner spinner=(Spinner)view.findViewById(R.id.spinner);


        ArrayAdapter arrayAdapter=new CustomArrayAdapter(
                getActivity(),
                R.layout.klass_list_layout,
                KlassLab.get().getKlasses());
      //  spinner.setAdapter(arrayAdapter);




        return view;
    }





    private class CustomArrayAdapter extends ArrayAdapter
    {
        private List<Klass> mKlasses;
        private LayoutInflater mInflater;
        private int res;
        private Klass mKlass;

        public CustomArrayAdapter(Context context,int layoutResId,List<Klass> arrayList)
        {
            super(context, layoutResId,arrayList);
            mKlasses=arrayList;
            mInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        private View getCustomView(int pos,View v,ViewGroup viewGroup) {
            View view = mInflater.inflate(res, viewGroup, false);
            mKlass = mKlasses.get(pos);

            TextView mTextView = (TextView) view.findViewById(R.id.klass_list_text_klass_name);
            TextView mSubTextView = (TextView) view.findViewById(R.id.klass_list_text_extra_info);

            if (pos == 0) {
                mTextView.setText("Please select a class");
            } else
            {
                mTextView.setText(mKlass.getKlassName());
                mSubTextView.setText("Students : " + mKlass.getNumOfStudents());
            }
            return view;
        }
    }

}

