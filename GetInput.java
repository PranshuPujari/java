import java.util.Scanner;
public class GetInput {
public static void main(String[] args) {
//Create an object of Scanner class to help get input
  try(Scanner myInput = new Scanner(System.in)){
//declare 4 memory boxes (variables)
int num1, num2, num3, total;
//get input
System.out.print("Enter 1st number: ");
num1 = myInput.nextInt();
System.out.print("Enter 2nd number: ");
num2 = myInput.nextInt();
System.out.print("Enter 3rd number: ");
num3 = myInput.nextInt();
//add all numbers into total
total = num1+num2+num3;
//print numbers and total
System.out.println("Sum of "+num1+", "+num2+", "+num3+" is "+total);
}
}
}
