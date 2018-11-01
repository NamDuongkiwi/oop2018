package week7.task1;

public class Numeral extends Expression {
    private int value;

    public Numeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    int evaluate() {
        return value;
    }

    @Override
    String tostring() {
        return Integer.toString(value);
    }
}
