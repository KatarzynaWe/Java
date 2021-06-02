package calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.println("Enter first number: ");
            float number1 = scanner.nextFloat();

            System.out.println("Enter second number: ");
            float number2 = scanner.nextFloat();

            System.out.println("Choose an operator: +, -, *, / or %: ");
            String operator = scanner.next();

            if(operator.equals("+")){
                calculator.addition(number1,number2);
            } else if (operator.equals("-")) {
                calculator.subtraction(number1,number2);
            } else if (operator.equals("*")) {
                calculator.multiplication(number1, number2);
            } else if (operator.equals("/")) {
                calculator.division(number1, number2);
            } else if (operator.equals("%")) {
                calculator.modulo(number1,number2);
            } else {
                System.out.println("Invalid operator entered!");
            }
        } catch (Exception e) {
            System.out.println("Wrong number. Enter number with or without a comma");
        }
    }
}
