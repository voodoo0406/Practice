package tw.com.voodoo0406.practice.designpattern.abstractfactory;

/**
 * Abstract Factory pattern: Abstract Factory relies on object composition: object creation is
 * implemented in methods exposed in the factory interface.
 *
 * Fix Problem: Two factories have the same products but different ingredients. We then extract the
 * ingredient creation to another factories and then use different ingredient factory to create different flavors of
 * products.
 */
public class Main {

  public static void main(String[] args) {
    IStore kfc = new KFC();
    kfc.getHamburger().eat();

    IStore mcdonald = new Mcdonald();
    mcdonald.getHamburger().eat();
  }
}
