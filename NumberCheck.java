import java.util.Scanner;
//    Chapter Three Task B
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num > 0)
            System.out.println("Positive");

        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}

