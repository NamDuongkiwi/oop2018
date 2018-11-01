package week7.task1;

public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate() {
        return getLeft().evaluate() - getRight().evaluate();
    }

    @Override
    String tostring() {
        return getLeft().tostring() + " - " + getRight().tostring();
    }
}
