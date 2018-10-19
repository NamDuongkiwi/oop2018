package week5_6;

public class Point {
    double x;
    double y;

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
