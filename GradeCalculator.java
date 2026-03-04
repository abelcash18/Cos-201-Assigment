import java.util.Scanner;
// Chapter Three Task A
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date:24-02-2026

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerical score: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100)
            System.out.println("Grade: A");
        else if (score >= 80)
            System.out.println("Grade: B");
        else if (score >= 70)
            System.out.println("Grade: C");

        else if (score >= 60)
            System.out.println("Grade: D");
        else if (score >= 50)
            System.out.println("Grade: P");
          else if (score >= 39)
            System.out.println("Grade: F");
        else
            System.out.println("Invalid score.");
    }
}

