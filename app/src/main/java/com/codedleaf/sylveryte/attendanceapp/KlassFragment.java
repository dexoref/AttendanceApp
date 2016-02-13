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
 *
 */



public class KlassFragment extends Fragment {

    private RecyclerView mKlassRecyclerView;
    private KlassAdapter mKlassAdapter;


    public KlassFragment() {

    }

    public static KlassFragment newInstance()
    {
        return new KlassFragment();
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.klass_fragment_layout,container,false);

        mKlassRecyclerView =(RecyclerView)view.findViewById(R.id.klass_layout_container_recycler_view);
        mKlassRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI()
    {
        KlassLab klassLab = KlassLab.get(getActivity());
        List<Klass> klasses = klassLab.getKlasses();
        mKlassAdapter =new KlassAdapter(klasses);
        mKlassRecyclerView.setAdapter(mKlassAdapter);
    }




    //view holder to hold views
    private class KlassHolder extends RecyclerView.ViewHolder
    {
        public TextView mTextView;

        public KlassHolder(View itemView)
        {
            super(itemView);
            mTextView=(TextView)itemView.findViewById(R.id.klass_list_text_klass_name);
        }

    }


    //adapter to manage
    private class KlassAdapter extends RecyclerView.Adapter<KlassHolder>
    {
        private List<Klass> mKlasses;

        public KlassAdapter(List<Klass> klasses)
        {
            mKlasses =klasses;
        }

        @Override
        public KlassHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view=layoutInflater.inflate(R.layout.klass_list_layout,parent,false);
            return new KlassHolder(view);
        }



        @Override
        public void onBindViewHolder(KlassHolder holder, int position) {
            Klass klass = mKlasses.get(position);
            holder.mTextView.setText(klass.getKlassName());
        }

        @Override
        public int getItemCount() {
            return mKlasses.size();
        }
    }
}
