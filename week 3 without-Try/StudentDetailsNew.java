import java.util.Scanner;

public class StudentDetailsNew  {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){
        
        String[] names = new String[5];
        int[] ages = new int[5];
        
        // Taking input for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }
        
        // Displaying student details
        System.out.println("\nStudent Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }
        
        scanner.close();
    }
  }
}

/*
Algorithm:
-Start the program.
-Create a Scanner object for user input.
-Declare arrays or variables to store five student names and their ages.
-Use a loop to take input for each student's name and age.
-Store the inputs in appropriate variables.
-Print out the names and ages of all five students.
End the program.
*/