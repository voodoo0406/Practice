package tw.com.voodoo0406.practice.designpattern.dependencyinjection.bad;

public class MyPump implements Pump {
  private Heater heater = new MyHeater();

  @Override
  public void pump() {
    if(heater.isHot()){
      System.out.println("Pumping...");
    }
  }
}
