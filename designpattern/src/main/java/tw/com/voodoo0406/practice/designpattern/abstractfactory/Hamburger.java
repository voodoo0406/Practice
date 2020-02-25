package tw.com.voodoo0406.practice.designpattern.abstractfactory;

public class Hamburger implements IFood {

  private ICheese cheese;
  private ISauce sauce;

  public Hamburger(ICheese cheese, ISauce sauce) {
    this.cheese = cheese;
    this.sauce = sauce;
  }

  @Override
  public void eat() {
    System.out
        .println("Eat Hamburger with " + cheese.getCheeseName() + " and " + sauce.getSauceName());
  }
}
