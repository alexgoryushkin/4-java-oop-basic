package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points = new ArrayList<Point>();

    /**
     * Конструктор по умолчанию
     */
    public PolygonalLine() {
    }

    /**
     * Конструктор
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public PolygonalLine(Point[] points) {
        setPoints(points);
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point point : points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double lenght = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            lenght += points.get(i).getLength(points.get(i + 1));
        }
        return lenght;
    }

}
