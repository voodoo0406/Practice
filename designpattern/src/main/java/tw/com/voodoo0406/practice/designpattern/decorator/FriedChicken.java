package tw.com.voodoo0406.practice.designpattern.decorator;

public class FriedChicken implements Meal {

  @Override
  public String getContent() {
    return "Fried Chicken";
  }

  @Override
  public int getPrice() {
    return 100;
  }
}
