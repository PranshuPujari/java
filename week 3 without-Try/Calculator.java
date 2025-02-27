import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      try(  Scanner scanner = new Scanner(System.in)){
        
        // Declare two double variables
        double num1, num2;
        
        // User input
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        
        // Calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? num1 / num2 : Double.POSITIVE_INFINITY;
        
        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }
        
        scanner.close();
    }
  }
}
