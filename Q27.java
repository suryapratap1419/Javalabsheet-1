import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter cost price: ₹");
        double costPrice = scanner.nextDouble();
        
        System.out.print("Enter selling price: ₹");
        double sellingPrice = scanner.nextDouble();
        
        double difference = sellingPrice - costPrice;
        
        if (difference > 0) {
            double profitPercent = (difference / costPrice) * 100;
            System.out.println("Profit: ₹" + difference);
            System.out.println("Profit Percentage: " + profitPercent + "%");
        } 
        else if (difference < 0) {
            double lossPercent = (-difference / costPrice) * 100;
            System.out.println("Loss: ₹" + (-difference));
            System.out.println("Loss Percentage: " + lossPercent + "%");
        } 
        else {
            System.out.println("No profit, no loss.");
        }
        
        scanner.close();
    }
}
