public class EmailAddress {
    //   Chapter Six Task 1
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        
        int atIndex = email.indexOf('@');
        
        if (atIndex != -1) {
            System.out.println("The '@' symbol is at index position: " + atIndex);
        } else {
            System.out.println("The '@' symbol was not found in the email address.");
        }
        
        scanner.close();
    }
}
