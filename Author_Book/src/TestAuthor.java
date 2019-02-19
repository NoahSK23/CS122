/*
 * A test driver for the Author class.
 */
public class TestAuthor {
   public static void main(String[] args) {
      // Test constructor and toString()
      Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
      System.out.println(ahTeck);  // toString()

      // Test Setters and Getters
      ahTeck.setEmail("teck@somewhere.com");
      System.out.println(ahTeck);  // toString()
      System.out.println("name is: " + ahTeck.getName());
      System.out.println("gender is: " + ahTeck.getGender());
      System.out.println("email is: " + ahTeck.getEmail());
   }
}