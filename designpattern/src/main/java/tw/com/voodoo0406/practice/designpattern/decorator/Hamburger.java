package tw.com.voodoo0406.practice.designpattern.decorator;

public class Hamburger implements Meal {

  @Override
  public String getContent() {
    return "Hamburger";
  }

  @Override
  public int getPrice() {
    return 80;
  }
}
