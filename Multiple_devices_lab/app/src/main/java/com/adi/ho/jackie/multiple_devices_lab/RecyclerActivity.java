package com.adi.ho.jackie.multiple_devices_lab;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.the_recycle_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(10));

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(RecyclerActivity.this,2);
            recyclerView.setLayoutManager(gridLayoutManager);
        } else {

            GridLayoutManager gridLayoutManager = new GridLayoutManager(RecyclerActivity.this, 3);
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        List<NumberObjects> numberObjectList = new ArrayList<>();
        for (int i = 1; i <7;i++) {
            numberObjectList.add(new NumberObjects(i));
        }
        MultRecyclerAdapter multRecyclerAdapter = new MultRecyclerAdapter(RecyclerActivity.this, numberObjectList);
        recyclerView.setAdapter(multRecyclerAdapter);


    }
}
