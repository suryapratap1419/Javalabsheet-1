import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        int asciiValue = (int) ch;
        
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + asciiValue);
        
        scanner.close();
    }
}
