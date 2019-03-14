package decoratorPattern;

public abstract class Beverage {
	
	String description="No";
	
	String getDescription() {
		return description;
		
	}
	
	abstract double cost();
	

}
