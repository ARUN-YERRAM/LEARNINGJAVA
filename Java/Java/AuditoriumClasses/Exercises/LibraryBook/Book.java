public class Book {
  public String name;
  public String authorName;
  public String genre;
  public boolean isIssued;
  
  Book(String name, String authorName, String genre){
    this.name = name;
    this.authorName = authorName;
    this.genre = genre;
    this.isIssued = false;
  }
}
