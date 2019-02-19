/*
 * A test driver program for the Book class.
 */
public class TestBook {
   public static void main(String[] args) {
      // We need an Author instance to create a Book instance
      Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
      System.out.println(ahTeck);  // Author's toString()

      // Test Book's constructor and toString()
      Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
      System.out.println(dummyBook);  // Book's toString()

      // Test Setters and Getters
      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      System.out.println(dummyBook);  // Book's toString()
      System.out.println("name is: " + dummyBook.getName());
      System.out.println("price is: " + dummyBook.getPrice());
      System.out.println("qty is: " + dummyBook.getQty());
      System.out.println("author is: " + dummyBook.getAuthor());  // invoke Author's toString()
      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());

      // Using an anonymous Author instance to create a Book instance
      Book moreDummyBook = new Book("Java for more dummies",
            new Author("Peter Lee", "peter@nowhere.com", 'm'), // an anonymous Author's instance
            19.99, 8);
      System.out.println(moreDummyBook);  // Book's toString()
   }
}