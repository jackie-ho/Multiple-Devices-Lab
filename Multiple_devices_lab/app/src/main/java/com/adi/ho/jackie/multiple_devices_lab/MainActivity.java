package com.adi.ho.jackie.multiple_devices_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cardButton = (Button) findViewById(R.id.card_button);
        cardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CardAndListActivity.class);
                startActivity(i);
            }
        });

        Button calButton = (Button) findViewById(R.id.calendar_button);
        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(j);
            }
        });

        Button recycleButton = (Button) findViewById(R.id.recycler_button);
        recycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(k);
            }
        });

    }
}
