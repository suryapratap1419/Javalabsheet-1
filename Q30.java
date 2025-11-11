import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        boolean validOperation = true;
        
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Calculation: " + num1 + " + " + num2 + " = " + result);
        } 
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Calculation: " + num1 + " - " + num2 + " = " + result);
        } 
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Calculation: " + num1 + " × " + num2 + " = " + result);
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Calculation: " + num1 + " ÷ " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed!");
                validOperation = false;
            }
        } 
        else {
            System.out.println("Error: Invalid operator!");
            validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}
