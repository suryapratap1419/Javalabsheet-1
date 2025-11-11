import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDivisors = 0;
        
        System.out.print("Divisors: ");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nSum of divisors: " + sumOfDivisors);
        
        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        scanner.close();
    }
}
