import java.util.Scanner;
//   Chapter Six Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

public class Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String trimmed = sentence.trim();
        
        System.out.println("Original sentence: \"" + sentence + "\"");
        System.out.println("Trimmed sentence: \"" + trimmed + "\"");
        
        scanner.close();
    }
}
