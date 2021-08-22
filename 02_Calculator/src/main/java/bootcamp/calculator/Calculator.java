package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;

public class Calculator {
    public BigDecimal calculate(final Params params) {
        BigDecimal x = params.getX();
        BigDecimal y = params.getY();
        String operator = params.getOperator();
        if (operator.equals("+")) {
            return (x.add(y).stripTrailingZeros());
        } else if (operator.equals("-")) {
            return (x.subtract(y).stripTrailingZeros());
        } else if (operator.equals("x")) {
            return (x.multiply(y).stripTrailingZeros());
        } else if (operator.equals("/")) {
            return (x.divide(y).stripTrailingZeros());
        } else {
            throw new IllegalArgumentException();
        }
    }
}
