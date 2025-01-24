import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;  // Default password length
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED for " + this.firstName + " " + this.lastName);

        // Call a method asking for department and return a department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        in.close();  // Close the scanner to prevent resource leak

        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$#&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());  // Corrected Math.random()
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // change the password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }


    public static void main(String[] args) {
        // Example usage
        EmailApp emailApp = new EmailApp("Irene", "Iroha");
    }
}


