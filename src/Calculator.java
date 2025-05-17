import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double firstValue;
        String operator;
        double secondValue;
        double result = 0;

        System.out.print("Enter the firstValue: ");
        firstValue = scanner.nextDouble();

        System.out.print("Please choose an operator (+, -, *, /)");
        operator = scanner.next();

        System.out.print("Enter the firstValue: ");
        secondValue = scanner.nextDouble();

        switch (operator){
            case "+" -> result = firstValue + secondValue;
            case "-" -> result = firstValue - secondValue;
            case "*" -> result = firstValue * secondValue;
            case "/" -> {
                if (secondValue == 0){
                    System.out.print("A number cannot be divided by zero! Please type a valid number");
                } else {
                    result = firstValue / secondValue;
                }
            }
            default -> System.out.println("Choose a valid operator!");

        }

        System.out.printf("The result is: %.2f", result);
    }
}
