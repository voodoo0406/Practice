package tw.com.voodoo0406.practice.designpattern.abstractfactory;

public class McdonaldIngredientFactory implements IIngredientFactory {

  @Override
  public ICheese getCheese() {
    return new McdonaldCheese();
  }

  @Override
  public ISauce getSauce() {
    return new McdonaldSauce();
  }
}
