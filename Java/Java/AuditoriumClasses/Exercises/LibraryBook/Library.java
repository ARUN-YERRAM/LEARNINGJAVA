public class Library {
  public String name;
  public int capasity;
  public Book[] books;
  public Library(String name, int capasity, Book[] books){
    this.name = name;
    this.capasity = capasity;
    this.books = books;
  }
  public void issueBook(Book b, Customer c){
    if(b.isIssued == false){
      b.isIssued = true;
      c.takeBook(b);
      System.out.println("The book:"+b.name+" has been issued to:"+c.name+" successfully!");
    } else {
      System.out.println("The book:"+b.name+" has already been issued.");
    }
  }
  
  public void returnBook(Book b){
    b.isIssued = false;
    System.out.println("The book:"+b.name+" has been returned successfully!");
  }
}
