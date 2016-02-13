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

    private RecyclerView mLectureRecyclerView;
    private LectureAdapter mLectureAdapter;

    public LectureFragment() {

    }

    public static LectureFragment newInstance()
    {
        return new LectureFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.list_fragment_layout,container,false);

        mLectureRecyclerView=(RecyclerView)view.findViewById(R.id.list_layout_container_recycler_view);
        mLectureRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI()
    {
        LectureLab lectureLab = LectureLab.get();
        List<Lecture> lectures = lectureLab.getLectures();
        mLectureAdapter=new LectureAdapter(lectures);
        mLectureRecyclerView.setAdapter(mLectureAdapter);
    }




    //view holder to hold views
    private class LectureHolder extends RecyclerView.ViewHolder
    {
        public TextView mTextView;
        public TextView mSubTextView;

        public LectureHolder(View itemView)
        {
            super(itemView);
            mTextView=(TextView)itemView.findViewById(R.id.klass_list_text_klass_name);
            mSubTextView=(TextView)itemView.findViewById(R.id.klass_list_text_extra_info);
        }

    }


    //adapter to manage
    private class LectureAdapter extends RecyclerView.Adapter<LectureHolder>
    {
        private List<Lecture> mLectures;

        public LectureAdapter(List<Lecture> lectures)
        {
            mLectures =lectures;
        }

        @Override
        public LectureHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view=layoutInflater.inflate(R.layout.klass_list_layout,parent,false);
            return new LectureHolder(view);
        }



        @Override
        public void onBindViewHolder(LectureHolder holder, int position) {
            Lecture lecture = mLectures.get(position);
            holder.mTextView.setText(lecture.getLectureName());
        }

        @Override
        public int getItemCount() {
            return mLectures.size();
        }
    }
}
