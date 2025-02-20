import java.util.Scanner;

public class RunningTotalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store numbers
        int num1, num2, num3, num4;
        int runningTotal = 0;
        
        // Taking input from user
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        runningTotal += num1;
        System.out.println("Running total: " + runningTotal);
        
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        runningTotal += num2;
        System.out.println("Running total: " + runningTotal);
        
        System.out.print("Enter third number: ");
        num3 = scanner.nextInt();
        runningTotal += num3;
        System.out.println("Running total: " + runningTotal);
        
        System.out.print("Enter fourth number: ");
        num4 = scanner.nextInt();
        runningTotal += num4;
        System.out.println("Running total: " + runningTotal);
        
        // Final total
        System.out.println("Final total: " + runningTotal);
        
        scanner.close();
    }
}
