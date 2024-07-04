/**
 *
 * @author ichla
 */
public class Book {
  private String author;
  private String title;
  private int pages;
  
  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }
  public String getAuthor() {
      return author;
  }
  public String getName() {
      return title;
  }
  public int getPages() {
      return pages;
  }
  public String toString() {
      return author + ", " + title + ", " + pages + " pages";
  }
}
