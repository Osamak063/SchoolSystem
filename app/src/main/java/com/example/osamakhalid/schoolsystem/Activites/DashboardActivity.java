package com.example.osamakhalid.schoolsystem.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.osamakhalid.schoolsystem.R;

public class DashboardActivity extends AppCompatActivity {
    private LinearLayout attendance, syllabus, results, noticeBoard, transport, messages, library, photoGallery, newsAndEvents,
            teacherDetails, fees, holidayAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        attendance = (LinearLayout) findViewById(R.id.attendance);
        syllabus = (LinearLayout) findViewById(R.id.syllabus);
        results = (LinearLayout) findViewById(R.id.results);
        noticeBoard = (LinearLayout) findViewById(R.id.notice_board);
        transport = (LinearLayout) findViewById(R.id.transport);
        messages = (LinearLayout) findViewById(R.id.messages);
        library = (LinearLayout) findViewById(R.id.library);
        photoGallery = (LinearLayout) findViewById(R.id.gallery);
        newsAndEvents = (LinearLayout) findViewById(R.id.news_and_events);
        teacherDetails = (LinearLayout) findViewById(R.id.teacher_details);
        fees = (LinearLayout) findViewById(R.id.fees);
        holidayAlert = (LinearLayout) findViewById(R.id.holiday_alert);
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Attendance.class));
            }
        });
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, TimeTable.class));
            }
        });
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Exam_Result.class));
            }
        });
        noticeBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Circular.class));
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Transport.class));
            }
        });
        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Messages.class));
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Library.class));
            }
        });
        photoGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, PhotoGallery.class));
            }
        });
        newsAndEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, NewsAndEvents.class));
            }
        });
        teacherDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Profile.class));

            }
        });
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Fees.class));
            }
        });
        holidayAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Alert.class));

            }
        });
    }
}
