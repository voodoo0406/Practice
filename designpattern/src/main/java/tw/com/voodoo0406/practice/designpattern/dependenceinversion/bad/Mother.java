package tw.com.voodoo0406.practice.designpattern.dependenceinversion.bad;

public class Mother {
  public void read(Book book) {
    System.out.println("Mother is reading");
    book.getContent();
  }
}
