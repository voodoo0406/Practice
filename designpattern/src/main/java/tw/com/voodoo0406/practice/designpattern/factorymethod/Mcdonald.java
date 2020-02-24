package tw.com.voodoo0406.practice.designpattern.factorymethod;

public class Mcdonald implements IStore {

  @Override
  public IFood getHamburger() {
    System.out.println("Prepare Mcdonald Hamburger");
    return new McdonaldHamburger();
  }

  public IFood getIceCream() {
    System.out.println("Prepare Mcdonald Ice Cream");
    return new McdonaldIceCream();
  }
}
