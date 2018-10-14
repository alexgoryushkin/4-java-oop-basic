package com.example.task04;

public class Line {
    private Point P1;
    private Point P2;

    public Line(Point p1, Point p2) {
        this.P1 = p1;
        this.P2 = p2;
    }

    public String toString() {
        return String.format("%s - %s", this.P1.toString(), this.P2.toString());
    }

    public String toString(String P1name, String P2name) {
        return String.format("%s%s - %s%s", P1name, this.P1.toString(), P2name, this.P2.toString());
    }

    public boolean isCollinearLine(Point p) {
        // Ax + By + C = 0
        int A = this.P1.y - this.P2.y;
        int B = this.P2.x - this.P1.x;
        int C = this.P1.x * this.P2.y - this.P2.x * this.P1.y;
        return (A * p.x + B * p.y + C == 0);
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }
}
