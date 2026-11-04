public class Book {

  void bookDetails(String title, String author, int price){
      System.out.println("Title: " + title);
      System.out.println("Author: " + author);
      System.out.println("Price: " + price);
  }

  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book();
    b1.bookDetails("Five Point Someone", "Chethan Bhaghat", 1000);

    System.out.println();

    b2.bookDetails("Atomic Habits", "Charl george", 2000);
    
  }
}
