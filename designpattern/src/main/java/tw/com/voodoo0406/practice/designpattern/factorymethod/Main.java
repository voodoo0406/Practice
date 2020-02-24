package tw.com.voodoo0406.practice.designpattern.factorymethod;

/**
 * Factory pattern:
 * The factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects
 * without having to specify the exact class of the object that will be created.
 *
 * Compare to simple factory pattern, it provides the flexibility to
 * 1. Define each factory's own product. For example, KFC and Mcdonald have their own hamburger.
 * 2. Define each factory's new product. For example, KFC has egg tower but Mcdonald doesn't.
 */
public class Main {

  public static void main(String[] args) {
    IStore kfc = new KFC();
    kfc.getHamburger().eat();
    ((KFC)kfc).getEggTower();

    IStore mcdonald = new Mcdonald();
    mcdonald.getHamburger().eat();
    ((Mcdonald)mcdonald).getIceCream();
  }
}
