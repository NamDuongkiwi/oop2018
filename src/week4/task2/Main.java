package week4.task2;

public class Main {
        public static void main(String[] args) {
            Shape shape = new Shape();
            Circle circle = new Circle();
            Rectangle rectangle = new Rectangle();
            Square square = new Square();
            System.out.println(shape.color);
            System.out.println("area of circle = "+circle.getArea());
            System.out.println("premeter of square  = "+ square.Perimeter());
        }
}
