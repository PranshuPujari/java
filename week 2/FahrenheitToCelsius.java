public class FahrenheitToCelsius {
  public static void main(String[] args) {
      // Declare and initialize fahrenheit variable
      double fahrenheit = 55.0; // Example value between 0 and 100
      
      // Calculate Celsius
      double celsius = (5.0 / 9) * (fahrenheit - 32);
      
      // Display the result
      System.out.println("Temperature in Fahrenheit: " + fahrenheit);
      System.out.println("Temperature in Celsius: " + celsius);
  }
}
