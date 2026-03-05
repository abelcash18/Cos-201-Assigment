import java.util.Scanner;
import java.util.regex.Pattern;
//   Chapter Six Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

public class SentenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
         boolean containsJava = Pattern.compile("\\bjava\\b", Pattern.CASE_INSENSITIVE).matcher(sentence).find();
        
        if (containsJava) {
            System.out.println("The sentence contains the word 'java'.");
        } else {
            System.out.println("The sentence does not contain the word 'java'.");
        }
        
        scanner.close();
    }
}
