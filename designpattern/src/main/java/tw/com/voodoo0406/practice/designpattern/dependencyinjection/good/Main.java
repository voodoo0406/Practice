package tw.com.voodoo0406.practice.designpattern.dependencyinjection.good;

public class Main {

  public static void main(String[] args) {
    Heater heater = new MyHeater();
    Pump pump = new MyPump(heater);
    CoffeeMaker coffeeMaker = new CoffeeMaker(heater, pump);
    coffeeMaker.makeCoffee();
  }
}
