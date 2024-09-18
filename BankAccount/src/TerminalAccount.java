// TO DO: Know and import the scanner class
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        // Display messages to the user
        // Get the values entered in the terminal using the scanner class
        Scanner myAccount = new Scanner(System.in);

        System.out.println("Please, enter the agency number: ");
        String agencyNum = myAccount.next();

        System.out.println("Enter your account number: ");
        int accountNum = myAccount.nextInt();

        System.out.println("Enter your name: ");
        String name = myAccount.next();

        System.out.println("Enter your lastname: ");
        String lastname = myAccount.next();

        Double balance = 237.48;

       // Display the created account message

       System.out.println("Hello, " + name + " " + lastname + ". Thank you for creating an account in our bank.");
        System.out.println("Your agency number is: " + agencyNum + ". Your account number is: " + accountNum + ", and your balance of $" + balance + " is now available withdrawal.");
        System.out.println("Your balance is: $ " + balance);
    }

}
