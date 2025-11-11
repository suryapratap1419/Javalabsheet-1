import java.util.Scanner;

public class OperatorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
        boolean validOperator = true;
        
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Operation: Addition");
        } 
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Operation: Subtraction");
        } 
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Operation: Multiplication");
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Operation: Division");
            } else {
                System.out.println("Error: Division by zero is not allowed!");
                validOperator = false;
            }
        } 
        else {
            System.out.println("Error: Invalid operator! Please use +, -, *, or /");
            validOperator = false;
        }
        
        if (validOperator) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}
