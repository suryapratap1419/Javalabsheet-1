import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        
        // Check if it's a 3-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            // Extract digits using arithmetic operations
            int originalNumber = number;
            int digit1 = number % 10;        // units place
            number /= 10;                   // remove units digit
            int digit2 = number % 10;        // tens place
            number /= 10;                   // remove tens digit
            int digit3 = number;             // hundreds place
            
            // Calculate sum of cubes of digits
            int sumOfCubes = (digit3 * digit3 * digit3) + 
                            (digit2 * digit2 * digit2) + 
                            (digit1 * digit1 * digit1);
            
            // Check if it's an Armstrong number
            if (sumOfCubes == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
                System.out.println(digit3 + "³ + " + digit2 + "³ + " + digit1 + 
                                 "³ = " + sumOfCubes);
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
                System.out.println(digit3 + "³ + " + digit2 + "³ + " + digit1 + 
                                 "³ = " + sumOfCubes + " ≠ " + originalNumber);
            }
        }
        
        scanner.close();
    }
}
