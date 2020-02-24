package tw.com.voodoo0406.practice.designpattern.simplefactory;

public class KFC {

  public static final String FOOD_HAMBURGER = "hamburger";
  public static final String FOOD_FIREDCHICKEN = "firedchicken";

  public IFood getFood(String foodName) {
    if (foodName == null) {
      return null;
    }
    switch (foodName) {
      case FOOD_HAMBURGER:
        return new Hamburger();
      case FOOD_FIREDCHICKEN:
        return new FiredChicken();
      default:
        return null;
    }
  }
}
