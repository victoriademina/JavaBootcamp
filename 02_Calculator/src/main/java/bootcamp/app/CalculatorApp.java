package bootcamp.app;

import bootcamp.calculator.Calculator;
import bootcamp.data.Params;

import java.math.BigDecimal;

/**
 * TODO: The application should be able to handle 3 arguments (first number, second number, operation).
 * The application should write the results to the standard output.
 */
public class CalculatorApp {
    public static void main(final String[] args) {
        BigDecimal firstNumber = new BigDecimal(args[0]);
        BigDecimal secondNumber = new BigDecimal(args[1]);
        String operation = args[2];
        Params params = new Params(
                firstNumber, secondNumber, operation
        );
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(params));
    }
}
