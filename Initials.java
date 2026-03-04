import java.util.Scanner;
//   Chapter Six Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026
public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = sc.nextLine().trim().replaceAll("\\s+", " ");
        String[] parts = name.split(" ");

            for (String part : parts) {
            System.out.print(Character.toUpperCase(part.charAt(0)));
        }
    }
}
