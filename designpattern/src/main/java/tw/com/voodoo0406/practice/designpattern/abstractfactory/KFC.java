package tw.com.voodoo0406.practice.designpattern.abstractfactory;

public class KFC implements IStore {

  private IIngredientFactory kfcIngredientFactory = new KfcIngredientFactory();

  @Override
  public IFood getHamburger() {
    return new Hamburger(kfcIngredientFactory.getCheese(), kfcIngredientFactory.getSauce());
  }
}
