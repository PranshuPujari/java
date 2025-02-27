/*ALGORITHM:
Input:
Prompt the user to enter their first name and store it in firstName.
Prompt the user to enter their last name and store it in lastName.
Processing:
Concatenate firstName, a space (" "), and lastName to create fullName.
Output:
Print the message: "Hello, my name is [full name]." using string concatenation.
*/ 
import java.util.Scanner;

  public class FullNameNew {
  public static void main(String[] args) {
     // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

     // Declare variables
     String firstName, lastName, fullName;

     // Get user input
     System.out.print("Enter your first name: ");
     firstName = scanner.nextLine();

     System.out.print("Enter your last name: ");
     lastName = scanner.nextLine();

     // Concatenate firstName and lastName to form fullName
     fullName = firstName + " " + lastName;

     // Display the output
     System.out.println("Hello, my name is " + fullName + ".");

     // Close scanner
     scanner.close();
    }
  }
