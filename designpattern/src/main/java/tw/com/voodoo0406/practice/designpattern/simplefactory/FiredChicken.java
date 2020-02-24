package tw.com.voodoo0406.practice.designpattern.simplefactory;

public class FiredChicken implements IFood {
  @Override
  public void eat() {
    System.out.println("Eat FiredChicken");
  }
}
