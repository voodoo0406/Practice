package tw.com.voodoo0406.practice.designpattern.dependencyinjection.good;

public class MyHeater implements Heater {

  private boolean heating = false;
  @Override
  public void on() {
    System.out.println("MyHeater is on");
    System.out.println("Heating...");
    System.out.println("Done");
    heating = true;
  }

  @Override
  public void off() {
    System.out.println("MyHeater is off");
    heating = false;
  }

  @Override
  public boolean isHot() {
    System.out.println("The water is hot!");
    return heating;
  }
}
