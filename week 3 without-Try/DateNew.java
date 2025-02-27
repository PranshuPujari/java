import java.util.Scanner;

public class DateNew {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        try(Scanner scanner = new Scanner(System.in)){

        // Declare variables
        String day, month;
        int date, year;

        // Get user input
        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        System.out.print("Enter the month: ");
        month = scanner.nextLine();

        System.out.print("Enter the date (number): ");
        date = scanner.nextInt();

        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        // Close scanner
        scanner.close();

        // Output the date in different formats
        
        System.out.println("American format: " + day + "," + month + "/" + date + "/" + year);
        System.out.println("European format: " + day + "," + date + "/" + month + "/" + year);
        System.out.println("Japanese format: " + year + "/" + month + "/" + date + "," + day);
    }
  }  
}

