import java.util.Scanner;
//   Chapter Six Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026


public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();


        if (word.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
