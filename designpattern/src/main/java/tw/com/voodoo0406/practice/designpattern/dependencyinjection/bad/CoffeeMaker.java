package tw.com.voodoo0406.practice.designpattern.dependencyinjection.bad;

public class CoffeeMaker {
  private Heater heater = new MyHeater();
  private Pump pump = new MyPump();

  public void makeCoffee() {
    System.out.println("Make Coffee");
    heater.on();
    pump.pump();
    System.out.println("Coffee is ready!");
    heater.off();
  }
}
