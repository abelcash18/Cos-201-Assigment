public class EmailAddress {
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
