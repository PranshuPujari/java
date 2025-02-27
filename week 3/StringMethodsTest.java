public class StringMethodsTest {
  public static void main(String[] args) {
      // a. Creating the String object
      String sentence = "I am a student of RMIT!";
      
      // b. Demonstrating the required methods
      
      // charAt()
      char charAtIndex5 = sentence.charAt(5);
      System.out.println("Character at index 5: " + charAtIndex5);
      
      // concat()
      String newSentence = sentence.concat(" I love programming.");
      System.out.println("Concatenated sentence: " + newSentence);
      
      // endsWith()
      boolean endsWithExclamation = sentence.endsWith("!");
      System.out.println("Ends with '!': " + endsWithExclamation);
      
      // equals()
      boolean isEqual = sentence.equals("I am a student of RMIT!");
      System.out.println("Equals original sentence: " + isEqual);
      
      // equalsIgnoreCase()
      boolean isEqualIgnoreCase = sentence.equalsIgnoreCase("i am a student of rmit!");
      System.out.println("Equals ignoring case: " + isEqualIgnoreCase);
      
      // length()
      int length = sentence.length();
      System.out.println("Length of sentence: " + length);
      
      // replace()
      String replacedSentence = sentence.replace("student", "learner");
      System.out.println("Replaced sentence: " + replacedSentence);
      
      // startsWith()
      boolean startsWithI = sentence.startsWith("I am");
      System.out.println("Starts with 'I am': " + startsWithI);
      
      // toUpperCase()
      String upperCaseSentence = sentence.toUpperCase();
      System.out.println("Uppercase sentence: " + upperCaseSentence);
  }
}

