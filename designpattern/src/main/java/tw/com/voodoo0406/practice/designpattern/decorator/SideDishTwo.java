package tw.com.voodoo0406.practice.designpattern.decorator;

public class SideDishTwo extends AbstractSideDish {

  public SideDishTwo(Meal mainMeal) {
    super(mainMeal);
  }

  @Override
  public String getContent() {
    return mainMeal.getContent() + " / Salad / Cola";
  }

  @Override
  public int getPrice() {
    return mainMeal.getPrice() + 50;
  }
}
