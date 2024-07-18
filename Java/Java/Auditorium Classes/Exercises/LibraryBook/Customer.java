public class Customer {
  public String name;
  public Book[] takenBooks;
  public int numBooks;
  Customer (String name){
    this.name = name;
    this.takenBooks = new Book[5];
    this.numBooks = 0;
  }
  public void takeBook(Book b){
    if(numBooks!=5)
      takenBooks[numBooks++] = b;
    else
      System.out.println("No more book passes left");
  }
}
