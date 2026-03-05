import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = input.replace(' ', '_');
        
        System.out.println("String with spaces replaced by underscores: " + result);
        
        scanner.close();
    }
}
