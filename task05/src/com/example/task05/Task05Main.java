package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {new Point(1, 2), new Point(2, 2), new Point(5, 5.999)};
        PolygonalLine line = new PolygonalLine(points);
        line.setPoints(points);
        double expected = line.getLength();
        System.out.println(expected);
    }
}
