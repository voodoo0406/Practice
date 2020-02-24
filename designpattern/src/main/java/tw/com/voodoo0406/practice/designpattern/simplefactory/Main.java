package tw.com.voodoo0406.practice.designpattern.simplefactory;

/**
 * Simple Factory principle:
 * In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the
 * problem of creating objects without having to specify the exact class of the object that will be created. This is done by
 * creating objects by calling a factory method—either specified in an interface and implemented by child classes, or
 * implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.
 *
 * Drawback:
 * If we want to add new factory, it needs to update the using method. In this example it's the Main class. It violates the
 * open-closed principle.
 */
public class Main {

  public static void main(String[] args) {
    KFC kfc = new KFC();
    IFood food = kfc.getFood(KFC.FOOD_HAMBURGER);
    if (food != null) {
      food.eat();
    } else {
      System.out.println("No this food");
    }

    food = kfc.getFood(KFC.FOOD_FIREDCHICKEN);
    if (food != null) {
      food.eat();
    } else {
      System.out.println("No this food");
    }

    food = kfc.getFood("Pizza");
    if (food != null) {
      food.eat();
    } else {
      System.out.println("No this food");
    }
  }
}
