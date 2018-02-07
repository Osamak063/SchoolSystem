package com.example.osamakhalid.schoolsystem.Model;

/**
 * Created by Osama Khalid on 2/4/2018.
 */

public class Attendance_Model {
    String date;
    String attendance;
    public Attendance_Model(String date,String attendance){
        this.date=date;
        this.attendance=attendance;
    }

    public String getDate() {
        return date;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }
}
