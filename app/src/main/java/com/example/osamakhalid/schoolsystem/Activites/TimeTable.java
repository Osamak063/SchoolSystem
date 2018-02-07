package com.example.osamakhalid.schoolsystem.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.osamakhalid.schoolsystem.Adapters.timetable_adapter;
import com.example.osamakhalid.schoolsystem.Model.TimeTable_Model;
import com.example.osamakhalid.schoolsystem.R;

import java.util.ArrayList;
import java.util.List;

public class TimeTable extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    public List<TimeTable_Model> listItems;
    TimeTable_Model timetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        listItems = new ArrayList<>();


        //for Dummy Data
        for (int i=0; i<5 ; i++){

            timetable = new TimeTable_Model();
            timetable.setSubject("Computer - "+(i+1));
            timetable.setMonday("09:00 - 02:00");
            timetable.setTueday("10:20 - 12:20");
            timetable.setWednesday("10:20 - 12:20");
            timetable.setThursday("-");
            timetable.setFriday("13:50 - 15:30");

            listItems.add(timetable);

        }


        //setting up recyclerview
        recyclerView =  findViewById(R.id.timetable);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new timetable_adapter(listItems,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
