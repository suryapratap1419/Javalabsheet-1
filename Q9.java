import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for subject 1 (out of 100): ");
        int marks1 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 2 (out of 100): ");
        int marks2 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 3 (out of 100): ");
        int marks3 = scanner.nextInt();
        
        int total = marks1 + marks2 + marks3;
        double percentage = (total / 300.0) * 100;
        
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");
        
        // Check pass/fail (>=40% in all subjects)
        if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        
        scanner.close();
    }
}
