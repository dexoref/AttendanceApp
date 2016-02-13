package com.codedleaf.sylveryte.attendanceapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sylveryte on 13/2/16.
 */
public class LectureFragment extends Fragment {

    private RecyclerView mClassRecyclerView;
    private ClassAdapter mClassAdapter;

    public LectureFragment() {

    }

    public static LectureFragment newInstance()
    {
        return new LectureFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.klass_fragment_layout,container,false);

        mClassRecyclerView=(RecyclerView)view.findViewById(R.id.klass_layout_container_recycler_view);
        mClassRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI()
    {
        KlassLab klassLab = KlassLab.get(getActivity());
        List<Klass> klasses = klassLab.getKlasses();
        mClassAdapter=new ClassAdapter(klasses);
        mClassRecyclerView.setAdapter(mClassAdapter);
    }




    //view holder to hold views
    private class ClassHolder extends RecyclerView.ViewHolder
    {
        public TextView mTextView;

        public ClassHolder(View itemView)
        {
            super(itemView);
            mTextView=(TextView)itemView.findViewById(R.id.klass_list_text_klass_name);
        }

    }


    //adapter to manage
    private class ClassAdapter extends RecyclerView.Adapter<ClassHolder>
    {
        private List<Klass> mClasses;

        public ClassAdapter(List<Klass> classes)
        {
            mClasses=classes;
        }

        @Override
        public ClassHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view=layoutInflater.inflate(R.layout.klass_list_layout,parent,false);
            return new ClassHolder(view);
        }



        @Override
        public void onBindViewHolder(ClassHolder holder, int position) {
            Klass klass =mClasses.get(position);
            holder.mTextView.setText(klass.getKlassName());
        }

        @Override
        public int getItemCount() {
            return mClasses.size();
        }
    }
}
