import java.util.Scanner;

class InputTester {

public static void main (String[] args) {

//Create a new Scanner object to get input from the keyboard

try(Scanner input = new Scanner(System.in)){

//Ask the user to enter a String

System.out.print("Enter your name: ");

//Read the string using the next() method, store in variable

String name = input.next();

//Read in the integer input using the nextInt() method

System.out.print("Enter your age " + name + " :");

int age = input.nextInt();

//Display output

System.out.println("Hi " + name + ". Good ta see ya!");

System.out.println("In 10 years you will be: "+(age+10));

}
}
}