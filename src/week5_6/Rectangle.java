package week5_6;

import javafx.scene.Group;
import javafx.stage.Stage;

public class Rectangle extends Shape{
    double wight;
    double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public double getWight() {
        return wight;
    }


    public Rectangle(double wight, double height) {

        this.wight = wight;
        this.height = height;
    }

    @Override
    public void draw(Stage primaryStage, Group root) {

    }

    @Override
    public double getArea() {
        return this.wight*this.height;
    }
}
