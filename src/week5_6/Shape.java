package week5_6;


import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public abstract class Shape {
    protected Color color ;
    protected Point point;
    abstract public double getArea();
    abstract public void draw(Stage primaryStage, Group root);
}
