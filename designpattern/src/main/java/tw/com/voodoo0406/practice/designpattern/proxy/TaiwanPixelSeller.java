package tw.com.voodoo0406.practice.designpattern.proxy;

public class TaiwanPixelSeller implements IPixelSeller {

  private UsaPixelSeller usaPixelSeller = new UsaPixelSeller();

  @Override
  public void sell() {
    usaPixelSeller.sell();
    System.out.println("Sell a Pixel phone in Taiwan");
  }
}
