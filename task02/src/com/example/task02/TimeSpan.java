package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void add(TimeSpan time) {
        this.seconds += time.seconds;
        this.minutes += time.minutes + this.seconds / 60;
        this.seconds %= 60;
        this.hours += time.hours + this.minutes / 60;
        this.minutes %= 60;
    }

    public void subtract(TimeSpan time) {
        this.seconds -= time.seconds;
        if (this.seconds < 0) {
            this.seconds += 60;
            this.minutes--;
        }
        this.minutes -= time.minutes;
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours--;
        }
        this.hours -= time.hours;
    }

    public String toString(){
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
