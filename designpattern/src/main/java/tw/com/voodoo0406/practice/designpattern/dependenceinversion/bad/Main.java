package tw.com.voodoo0406.practice.designpattern.dependenceinversion.bad;

/**
 * Dependency Inversion Principle: The Dependency Inversion Principle (DIP) states that high level
 * modules should not depend on low level modules; both should depend on abstractions. Abstractions
 * should not depend on details. Details should depend upon abstractions.
 */
public class Main {

  public static void main(String[] args) {
    Mother mother = new Mother();
    mother.read(new Book());
//    mother.read(new Newspaper());  // BAD! Mother cannot read Newspaper!
  }
}
