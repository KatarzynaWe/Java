package calculator;

public class Calculator {

    public void addition (float number1, float number2){
        float result  = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }
    public void subtraction (float number1, float number2){
        float result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
    }
    public void multiplication (float number1, float number2){
        float result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
    }
    public void division (float number1, float number2){
        float result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
    }
    public void modulo (float number1, float number2) {
        float result = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + result);
    }
}
