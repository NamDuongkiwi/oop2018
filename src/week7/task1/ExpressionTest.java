package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression x = new Numeral(10);
        Expression y = new Numeral(1);
        Expression z = new Numeral(2);
        Expression t = new Numeral(3);

        //10^2
        Expression sqr = new Square(x);

        //10^2 - 1
        Expression sub = new Subtraction(sqr, y);

        //2x3
        Expression mul = new Multiplication(z,t);

        Expression add = new Addition(sub, mul);
        Expression result = new Square(add);
        System.out.println(result.tostring() + " = " + result.evaluate());
    }
}
