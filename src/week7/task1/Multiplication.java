package week7.task1;

public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate() {
        return getLeft().evaluate()*getRight().evaluate();
    }

    @Override
    String tostring() {
        String l,r;
        if(getLeft() instanceof Addition || getLeft() instanceof Subtraction){
            l = "(" + getLeft().tostring() + ")";
        }else l = getLeft().tostring();
        if(getRight() instanceof Addition || getRight() instanceof Subtraction){
            r = "(" + getRight().tostring() + ")";
        }else  r = getRight().tostring();
        return l + "x" + r;
    }
}
