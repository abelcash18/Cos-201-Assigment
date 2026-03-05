import java.util.Scanner;
import java.util.regex.Pattern;

public class SentenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Check if the sentence contains the word "java" (case-insensitive)
        boolean containsJava = Pattern.compile("\\bjava\\b", Pattern.CASE_INSENSITIVE).matcher(sentence).find();
        
        if (containsJava) {
            System.out.println("The sentence contains the word 'java'.");
        } else {
            System.out.println("The sentence does not contain the word 'java'.");
        }
        
        scanner.close();
    }
}
