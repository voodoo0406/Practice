package tw.com.voodoo0406.practice.designpattern.decorator;

public abstract class AbstractSideDish implements Meal {
  protected Meal mainMeal;
  public AbstractSideDish(Meal mainMeal){
    this.mainMeal = mainMeal;
  }
}
