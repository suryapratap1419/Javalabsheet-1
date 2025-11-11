import java.util.Scanner;

public class FirstLastDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Validate if it's a 5-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid 5-digit number.");
        } else {
            // Extract first digit
            int firstDigit = number / 10000;
            
            // Extract last digit
            int lastDigit = number % 10;
            
            System.out.println("Number: " + number);
            System.out.println("First digit: " + firstDigit);
            System.out.println("Last digit: " + lastDigit);
            
            if (firstDigit == lastDigit) {
                System.out.println("First and last digits are the same.");
            } else {
                System.out.println("First and last digits are different.");
            }
        }
        
        scanner.close();
    }
}
