package tw.com.voodoo0406.practice.designpattern.abstractfactory;

public class KfcIngredientFactory implements IIngredientFactory {

  @Override
  public ICheese getCheese() {
    return new KfcCheese();
  }

  @Override
  public ISauce getSauce() {
    return new KfcSauce();
  }
}
