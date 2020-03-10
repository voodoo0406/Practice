package tw.com.voodoo0406.practice.designpattern.dependencyinjection.bad;

public class Main {

  public static void main(String[] args) {

    CoffeeMaker coffeeMaker = new CoffeeMaker();
    coffeeMaker.makeCoffee();
  }
}
