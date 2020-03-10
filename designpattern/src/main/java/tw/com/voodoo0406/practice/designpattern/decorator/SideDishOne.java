package tw.com.voodoo0406.practice.designpattern.decorator;

public class SideDishOne extends AbstractSideDish {

  public SideDishOne(Meal mainMeal) {
    super(mainMeal);
  }

  @Override
  public String getContent() {
    return mainMeal.getContent() + " / FrenchFries / Cola";
  }

  @Override
  public int getPrice() {
    return mainMeal.getPrice() + 30;
  }
}
