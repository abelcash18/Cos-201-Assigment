import java.io.*;
import java.util.Scanner;
//   Chapter Eight Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026


public class FileReading {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean success = false;
        
        while (!success) {
            System.out.print("Enter a file name (or type 'exit' to quit): ");
            String fileName = userInput.nextLine().trim();
            
            // Check if user wants to exit
            if (fileName.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            try {
                // Open and read the file
                FileReader fileReader = new FileReader(fileName);
                Scanner fileScanner = new Scanner(fileReader);
                
                // Read two numbers from the file
                if (!fileScanner.hasNextDouble()) {
                    throw new NumberFormatException("First number not found in file");
                }
                double number1 = fileScanner.nextDouble();
                
                if (!fileScanner.hasNextDouble()) {
                    throw new NumberFormatException("Second number not found in file");
                }
                double number2 = fileScanner.nextDouble();
                
                // Calculate and display the sum
                double sum = number1 + number2;
                System.out.println("Sum of " + number1 + " and " + number2 + " = " + sum);
                
                // Clean up resources
                fileScanner.close();
                fileReader.close();
                
                success = true;
                
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found. Please check the file name and try again.");
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage() + " Make sure the file contains two valid numbers.");
            } catch (IOException e) {
                System.out.println("Error: An I/O error occurred while reading the file: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: An unexpected error occurred: " + e.getMessage());
            }
        }
        
        userInput.close();
    }
}
