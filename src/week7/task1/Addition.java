package week7.task1;

public class Addition extends BinaryExpression{
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate() {
        return (getLeft().evaluate()+getRight().evaluate());
    }

    @Override
    String tostring() {
        return getLeft().tostring() + " + " + getRight().tostring();
    }
}
