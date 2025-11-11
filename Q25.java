import java.util.Scanner;

public class LogicalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first boolean (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.print("Enter second boolean (true/false): ");
        boolean b = scanner.nextBoolean();
        
        System.out.print("Enter logical operator (&&, ||, ! for first value): ");
        String operator = scanner.next();
        
        boolean result = false;
        
        if (operator.equals("&&")) {
            result = a && b;
            System.out.println(a + " AND " + b + " = " + result);
        } 
        else if (operator.equals("||")) {
            result = a || b;
            System.out.println(a + " OR " + b + " = " + result);
        } 
        else if (operator.equals("!")) {
            result = !a;
            System.out.println("NOT " + a + " = " + result);
        } 
        else {
            System.out.println("Invalid operator! Use &&, ||, or !");
        }
        
        scanner.close();
    }
}
