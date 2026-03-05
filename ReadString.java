import java.util.Scanner;
//   Chapter Six Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

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
