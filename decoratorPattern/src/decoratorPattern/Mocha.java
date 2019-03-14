package decoratorPattern;

public class Mocha extends Condiments {

	
	Mocha(Beverage beverage)
	{
		this.beverage=beverage;
	}
	
	String getDescription()
	{
		return beverage.getDescription()+", Mocha";
	}
	double cost() {
		// TODO Auto-generated method stub
		return 20.00+beverage.cost();
	}

}
