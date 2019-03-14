package decoratorPattern;

public abstract class Condiments extends Beverage {
	
	Beverage beverage;
	
	@Override
	abstract double cost();

}
