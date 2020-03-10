package tw.com.voodoo0406.practice.designpattern.dependenceinversion.good;

public class Newspaper implements IReader {
  @Override
  public void getContent() {
    System.out.println("Jeremy Lin plays well in CBA!");
  }
}
