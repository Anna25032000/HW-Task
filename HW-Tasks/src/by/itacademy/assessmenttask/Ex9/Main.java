package by.itacademy.assessmenttask.Ex9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        points.add(new Point(1, 2, 3));
        points.add(new Point(-4, 5, -6));
        points.add(new Point(-1, -2, -3));
        points.add(new Point(7, -8, 9));

        Point maxPointX = points.stream()
                .max(Comparator.comparing(Point::getX))
                .orElse(null);
        System.out.println("точка с наибольшим значением координаты x:" + maxPointX);

        points.stream()
                .map(Point::distance)
                .forEach(distance -> System.out.println("расстоянием от точки до начала координат: " + distance));

        List<Point> distantPoints = points.stream()
                .filter(point -> point.distance() > 5)
                .toList();
        System.out.println("расстояние до начала координат которые больше 5: " + distantPoints);

        List<Point> sortedPoints = points.stream()
                .sorted(Comparator.comparing(Point::distance).reversed())
                .toList();
        System.out.println("Точки отсорированны по убыванию от начала координат: " + sortedPoints);
    }
}


