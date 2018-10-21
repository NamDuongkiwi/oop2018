package week5_6;

import javafx.scene.Group;
import javafx.stage.Stage;

public class Triangle extends Shape {
    double a, b, c;

    public void setC(double c) {
        this.c = c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw(Stage primaryStage, Group root) {

    }

    @Override
    public Point move(Point x) {
        this.point = x;
        return this.point;
    }
}
