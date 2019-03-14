package decoratorPattern;

public class WhippedCream extends Condiments {

	public WhippedCream(Beverage beverage) {
		this.beverage=beverage;
		
	}
	
	String getDescription() {
		return beverage.getDescription()+", Whipped cream";
	}
	
	@Override
	double cost() {
		// TODO Auto-generated method stub
		return 30.00+beverage.cost();
	}

}
