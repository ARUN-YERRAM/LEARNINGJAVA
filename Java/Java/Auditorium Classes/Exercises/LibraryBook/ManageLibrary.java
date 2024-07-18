public class ManageLibrary {
  public static void main (String[] args){
    Book b1 = new Book("The Silver Eyes", "Scott Cawthon", "Thriller");
    Book b2 = new Book("The Twisted Ones", "Scott Cawthon", "Thriller");
    Book b3 = new Book("The Fourth Closet", "Scott Cawthon", "Thriller");    
    Book b4 = new Book("The Theory of Everything", "Stephen Hawking", "Science");
    
    Book[] books = {b1, b2, b3, b4};
    Customer c1 = new Customer("Srikar");
    Library l1 = new Library("My Library", 200, books);
    l1.issueBook(b1);
    l1.issueBook(b3);
    l1.issueBook(b1);
    l1.returnBook(b1);
  }
}
