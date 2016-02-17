package com.adi.ho.jackie.multiple_devices_lab;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by JHADI on 2/17/16.
 */
public class MultRecyclerViewHolder extends RecyclerView.ViewHolder{
    public CardView cardView;
    public TextView numberTextView;

    public MultRecyclerViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cardview);
        numberTextView =  (TextView)itemView.findViewById(R.id.number_onthecard);
    }


}
