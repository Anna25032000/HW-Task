package by.itacademy.assessmenttask.Ex9;

public class Point {
    private final double x;
    private final double y;
    private final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ", z=" + z + ')';
    }
}


