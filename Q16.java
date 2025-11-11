import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your annual income: ₹");
        double income = scanner.nextDouble();
        double tax = 0;
        
        if (income <= 250000) {
            tax = 0;
            System.out.println("Tax Category: No tax");
        } 
        else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
            System.out.println("Tax Category: 5% slab");
        } 
        else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.20;
            System.out.println("Tax Category: 20% slab");
        } 
        else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
            System.out.println("Tax Category: 30% slab");
        }
        
        System.out.println("Annual Income: ₹" + income);
        System.out.println("Tax Payable: ₹" + tax);
        System.out.println("Net Income: ₹" + (income - tax));
        
        scanner.close();
    }
}
