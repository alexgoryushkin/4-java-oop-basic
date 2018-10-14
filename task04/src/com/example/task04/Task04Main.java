package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line line = new Line(new Point(-2, -2), new Point(2, 2));
        System.out.println(line.toString());                            //(-2, -2) - (2, 2)
        System.out.println(line.toString("A", "B"));    //A(-2, -2) - B(2, 2)
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(2, 2);
        String res = point1.toString() + (line.isCollinearLine(point1) ? " на отрезке" : " не на отрезке") + "\n";
        res += point2.toString() + (line.isCollinearLine(point2) ? " на отрезке" : " не на отрезке") + "\n";
        res += point3.toString() + (line.isCollinearLine(point3) ? " на отрезке" : " не на отрезке");
        System.out.println(res);

    }
}
