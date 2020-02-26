package tw.com.voodoo0406.practice.designpattern.proxy;

public class UsaPixelSeller implements IPixelSeller {

  @Override
  public void sell() {
    System.out.println("Sell a Pixel phone in USA");
  }
}
