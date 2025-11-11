import java.util.Scanner;

public class SquareRectangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        
        if (length == breadth) {
            System.out.println("It is a square.");
            System.out.println("Area: " + (length * length));
        } else {
            System.out.println("It is a rectangle.");
            System.out.println("Area: " + (length * breadth));
            System.out.println("Perimeter: " + (2 * (length + breadth)));
        }
        
        scanner.close();
    }
}
