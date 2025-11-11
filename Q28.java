import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        
        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }
        
        int digitCount = 0;
        int temp = number;
        
        // Count digits using while loop
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        
        // Handle the case when number is 0
        if (number == 0) {
            digitCount = 1;
        }
        
        System.out.println("Number: " + originalNumber);
        System.out.println("Number of digits: " + digitCount);
        
        scanner.close();
    }
}
