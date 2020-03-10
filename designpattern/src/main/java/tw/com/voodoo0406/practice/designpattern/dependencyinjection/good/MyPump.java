package tw.com.voodoo0406.practice.designpattern.dependencyinjection.good;

public class MyPump implements Pump {
  private Heater heater;

  public MyPump(Heater heater) {
    this.heater = heater;
  }

  @Override
  public void pump() {
    if(heater.isHot()){
      System.out.println("Pumping...");
    }
  }
}
