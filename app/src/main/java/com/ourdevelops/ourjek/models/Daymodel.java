package com.ourdevelops.ourjek.models;

import java.io.Serializable;

public class Daymodel  implements Serializable {

    String day,time;

    public Daymodel(String day, String time) {
        this.day = day;
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
