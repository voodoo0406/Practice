package tw.com.voodoo0406.practice.designpattern.abstractfactory;

public class Mcdonald implements IStore {

  IIngredientFactory mcdonaldIngredientFactory = new McdonaldIngredientFactory();

  @Override
  public IFood getHamburger() {
    return new Hamburger(mcdonaldIngredientFactory.getCheese(),
        mcdonaldIngredientFactory.getSauce());
  }
}
