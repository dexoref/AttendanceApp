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
public class AttendanceFragment extends Fragment {

    private RecyclerView mAttendanceRecyclerView;
    private AttendanceAdapter mAttendanceAdapter;

    public AttendanceFragment() {

    }

    public static AttendanceFragment newInstance()
    {
        return new AttendanceFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.list_fragment_layout,container,false);

        mAttendanceRecyclerView=(RecyclerView)view.findViewById(R.id.list_layout_container_recycler_view);
        mAttendanceRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI()
    {
        AttendanceLab attendanceLab = AttendanceLab.get(getActivity());
        List<Attendance> attendances = attendanceLab.getAttendances();
        mAttendanceAdapter =new AttendanceAdapter(attendances);
        mAttendanceRecyclerView.setAdapter(mAttendanceAdapter);
    }




    //view holder to hold views
    private class AttendanceHolder extends RecyclerView.ViewHolder
    {
        public TextView mTextView;
        public TextView mSubTextView;

        public AttendanceHolder(View itemView)
        {
            super(itemView);
            mTextView=(TextView)itemView.findViewById(R.id.klass_list_text_klass_name);
            mSubTextView=(TextView)itemView.findViewById(R.id.klass_list_text_extra_info);
        }

    }


    //adapter to manage
    private class AttendanceAdapter extends RecyclerView.Adapter<AttendanceHolder>
    {
        private List<Attendance> mAttendances;

        public AttendanceAdapter(List<Attendance> attendances)
        {
            mAttendances =attendances;
        }

        @Override
        public AttendanceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view=layoutInflater.inflate(R.layout.klass_list_layout,parent,false);
            return new AttendanceHolder(view);
        }



        @Override
        public void onBindViewHolder(AttendanceHolder holder, int position) {
            Attendance attendance = mAttendances.get(position);
            holder.mTextView.setText(attendance.getAttendanceName());
            holder.mSubTextView.setText(" "+attendance.getAttendanceStudents());
        }

        @Override
        public int getItemCount() {
            return mAttendances.size();
        }
    }

}
