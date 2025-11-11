import java.util.Scanner;

public class FloatToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a floating-point number: ");
        float floatNum = scanner.nextFloat();
        
        int intNum = (int) floatNum; // Explicit conversion
        
        System.out.println("Original float value: " + floatNum);
        System.out.println("Converted integer value: " + intNum);
        
        scanner.close();
    }
}
