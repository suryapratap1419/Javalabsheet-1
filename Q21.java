import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();
        
        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();
        
        System.out.print("Enter third angle: ");
        int angle3 = scanner.nextInt();
        
        int sum = angle1 + angle2 + angle3;
        
        if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("Valid triangle with angles: " + angle1 + "°, " + angle2 + "°, " + angle3 + "°");
            
            // Additional classification
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Type: Right-angled triangle");
            } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Type: Acute-angled triangle");
            } else {
                System.out.println("Type: Obtuse-angled triangle");
            }
        } else {
            System.out.println("Invalid triangle! Sum of angles must be 180° and each angle > 0°.");
        }
        
        scanner.close();
    }
}
