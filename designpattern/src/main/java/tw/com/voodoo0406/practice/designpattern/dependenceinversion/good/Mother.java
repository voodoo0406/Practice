package tw.com.voodoo0406.practice.designpattern.dependenceinversion.good;

public class Mother {
  public void read(IReader reader) {
    System.out.println("Mother is reading");
    reader.getContent();
  }
}
