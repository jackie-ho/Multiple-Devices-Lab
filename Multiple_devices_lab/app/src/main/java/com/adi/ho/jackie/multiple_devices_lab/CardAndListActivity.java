package com.adi.ho.jackie.multiple_devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class CardAndListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_and_list);

        ArrayList<String> arrayList = new ArrayList<>();
        String[] numberList = {"One","Two","Three","Four","Five","Six"};
        arrayList.addAll(Arrays.asList(numberList));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(CardAndListActivity.this,R.layout.custom_card_list_textview,arrayList);
        ListView listView = (ListView) findViewById(R.id.list_of_stuff);
        listView.setAdapter(arrayAdapter);

    }
}
