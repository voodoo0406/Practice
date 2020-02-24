package tw.com.voodoo0406.practice.designpattern.factorymethod;

public class KFC implements IStore {

  @Override
  public IFood getHamburger() {
    System.out.println("Prepare KFC Hamburger");
    return new KfcHamburger();
  }

  public IFood getEggTower() {
    System.out.println("Prepare KFC Egg Tower");
    return new KfcEggTower();
  }
}
