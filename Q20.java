import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);
        
        // Using nested if-else to check eligibility
        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage. Minimum age for males is 21.");
            }
        } 
        else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage. Minimum age for females is 18.");
            }
        } 
        else {
            System.out.println("Invalid gender input! Please enter M or F.");
        }
        
        scanner.close();
    }
}
