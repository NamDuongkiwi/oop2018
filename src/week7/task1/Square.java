package week7.task1;

public class Square extends Expression {
    private Expression expression;

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    @Override
    String tostring() {
        if (expression instanceof Numeral){
            return expression.tostring() + "^2";
        }
        else return "(" + expression.tostring() + ")^2";

    }
}
