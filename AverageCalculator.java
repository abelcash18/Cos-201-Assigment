//   Chapter Nine Average Calculator
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to average? ");
        int count = scanner.nextInt();
        
        double[] numbers = new double[count];
        double sum = 0;
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / numbers.length;
        System.out.println("\nAverage: " + average);
        
        scanner.close();
    }
}
