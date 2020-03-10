package tw.com.voodoo0406.practice.designpattern.dependencyinjection.good;

public class CoffeeMaker {
  private Heater heater;
  private Pump pump;

  public CoffeeMaker(Heater heater,
      Pump pump) {
    this.heater = heater;
    this.pump = pump;
  }

  public void makeCoffee() {
    System.out.println("Make Coffee");
    heater.on();
    pump.pump();
    System.out.println("Coffee is ready!");
    heater.off();
  }
}
