package tw.com.voodoo0406.practice.designpattern.dependenceinversion.good;

public class Book implements IReader {
  @Override
  public void getContent() {
    System.out.println("Beauty and Beast");
  }
}
