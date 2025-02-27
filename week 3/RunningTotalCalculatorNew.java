import java.util.Scanner;

public class RunningTotalCalculatorNew {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        double total = 0; // Variable to store running total
        
        // Loop to take four inputs
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            total += num;
            System.out.println("Running total: " + total);
        }
        
        // Display final total
        System.out.println("Final total: " + total);
        
        scanner.close();
    }
  }

