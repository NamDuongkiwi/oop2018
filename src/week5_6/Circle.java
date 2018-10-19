package week5_6;



import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.Group;




public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Stage primaryStage, Group root) {

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(this.point.x);
        ellipse.setCenterY(this.point.y);


        ellipse.setRadiusX(this.radius);
        ellipse.setRadiusY(this.radius);

        // Mầu nền
        ellipse.setFill(this.color);
        root.getChildren().add(ellipse);
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*3.14;
    }
}
