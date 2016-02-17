package com.adi.ho.jackie.multiple_devices_lab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHADI on 2/17/16.
 */
public class MultRecyclerAdapter extends RecyclerView.Adapter<MultRecyclerViewHolder> {

    private Context context;
    private List<NumberObjects> numberObjectsList;

    public MultRecyclerAdapter(Context context, List<NumberObjects> numberObjectsList){
        this.context = context;
        this.numberObjectsList = numberObjectsList;
    }

    @Override
    public MultRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_recyclerview, null);
        MultRecyclerViewHolder recyclerViewHolder = new MultRecyclerViewHolder(layoutView);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(MultRecyclerViewHolder holder, int position) {
        holder.numberTextView.setText("" +numberObjectsList.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return numberObjectsList.size();
    }
}
