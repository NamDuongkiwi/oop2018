package week5_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape cc1 = new Circle(4);
        Shape cc2 = new Circle(5);
        Shape cc3 = new Circle(6);
        Shape rec1 = new Rectangle(3,4);
        Shape rec2 = new Rectangle(4,5);
        Shape Tri = new Triangle(2,3,4);
        Shape Tri2 = new Triangle(3,4,5);

        ArrayList<Shape> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(rec1);
        list.add(rec2);
        list.add(Tri);
        list.add(Tri2);


        Layer layer = new Layer(list);
        ArrayList<Layer> dia = new ArrayList<>();
        Diagram diagram = new Diagram(dia);
        layer.deleteCircle();
        layer.out();



    }
}
