package tw.com.voodoo0406.practice.designpattern.decorator;

/**
 * Decorator Pattern: The decorator pattern is a design pattern that allows behavior to be added to
 * an individual object, dynamically, without affecting the behavior of other objects from the same
 * class.
 *
 * Decorator Pattern vs Proxy Pattern The two design patterns looks the same with each other. With
 * Decorator Pattern, the decorator and the decoratee implement the same interfaces. With Proxy
 * Pattern, the proxy class and the real class delegated implement the same interfaces. Furthermore,
 * no matter which pattern is used, it is easy to add functions before or after the method of the
 * real object. However, in fact, there are some differences between Decorator Pattern and Proxy
 * Pattern. Decorator Pattern focuses on dynamically adding functions to an object, while Proxy
 * Pattern focuses on controlling access to an object. In other words, with Proxy Pattern, the proxy
 * class can hide the detail information of an object from its client. Therefore, when using Proxy
 * Pattern, we usually create an instance of abject inside the proxy class. And when using Decorator
 * Pattern, we typically pass the original object as a parameter to the constructor of the
 * decorator.
 *
 * We can use another sentence to conclude their differences: with the Proxy pattern, the
 * relationship between a proxy and the real subject is typically set at compile time, whereas
 * decorators can be recursively constructed at runtime.
 */
public class Main {

  public static void main(String[] args) {
    Hamburger hamburger = new Hamburger();
    System.out.println(hamburger.getContent() + " costs " + hamburger.getPrice());
    FriedChicken friedChicken = new FriedChicken();
    System.out.println(friedChicken.getContent() + " costs " + friedChicken.getPrice());
    Meal sideDishOne = new SideDishOne(hamburger);
    System.out.println(sideDishOne.getContent() + " costs " + sideDishOne.getPrice());
    Meal sideDishTwo = new SideDishTwo(friedChicken);
    System.out.println(sideDishTwo.getContent() + " costs " + sideDishTwo.getPrice());
    Meal sideDishOneAndTwo = new SideDishTwo(sideDishOne);
    System.out.println(sideDishOneAndTwo.getContent() + " costs " + sideDishOneAndTwo.getPrice());
  }
}
