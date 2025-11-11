import java.util.Scanner;

public class HeightClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        
        if (height < 150) {
            System.out.println("Classification: Short");
        } 
        else if (height <= 170) {
            System.out.println("Classification: Average");
        } 
        else {
            System.out.println("Classification: Tall");
        }
        
        // Additional information
        System.out.println("Height: " + height + " cm");
        
        // Convert to feet and inches
        double heightInInches = height / 2.54;
        int feet = (int)(heightInInches / 12);
        int inches = (int)(heightInInches % 12);
        System.out.println("Height in feet: " + feet + "'" + inches + "\"");
        
        scanner.close();
    }
}
