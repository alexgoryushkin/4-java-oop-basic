package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan();
        TimeSpan t2 = new TimeSpan(12,59,59);
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());
        t1.add(t2);
        System.out.println("t1 + t2 = " + t1.toString());
        t1.subtract(t2);
        t1.subtract(t2);
        System.out.println("t1 - t2 = " + t1.toString());
    }
}
