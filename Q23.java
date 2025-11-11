import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Using type casting and explicit conversion
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        
        // Additional classification
        if (fahrenheit <= 32) {
            System.out.println("Freezing temperature");
        } else if (fahrenheit <= 50) {
            System.out.println("Cold temperature");
        } else if (fahrenheit <= 86) {
            System.out.println("Moderate temperature");
        } else {
            System.out.println("Hot temperature");
        }
        
        scanner.close();
    }
}
