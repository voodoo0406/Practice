package tw.com.voodoo0406.practice.designpattern.proxy;

/**
 * Proxy Pattern:
 * Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls
 * access to the original object, allowing you to perform something either before or after the request gets through to the
 * original object.
 */
public class Main {

  public static void main(String[] args) {
    TaiwanPixelSeller taiwanPixelSeller = new TaiwanPixelSeller();
    taiwanPixelSeller.sell();
  }
}
