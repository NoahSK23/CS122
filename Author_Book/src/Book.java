/*
 * The Book class models a book with one (and only one) author.
 */
public class Book {
   // The private instance variables
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   // Constructor
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   public String getName() {
      return name;
   }
   public Author getAuthor() {
      return author;  // return member author, which is an instance of the class Author
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public int getQty() {
      return qty;
   }
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   // The toString() describes itself
   public String toString() {
      return "'" + name + "' by " + author;  // author.toString()
   }
}