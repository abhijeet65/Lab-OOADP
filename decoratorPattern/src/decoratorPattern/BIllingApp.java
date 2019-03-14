package decoratorPattern;

public class BIllingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage mybeverage =new Espresso();
		
		System.out.println(mybeverage.getDescription()+" , "+mybeverage.cost());
		Beverage beverage2=new Mocha(mybeverage);
		
		System.out.println(beverage2.getDescription()+" , "+beverage2.cost());
		beverage2 = new WhippedCream(beverage2);
		System.out.println(beverage2.getDescription()+" , "+beverage2.cost());
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription()+" , "+beverage2.cost());
		
		

	}

}
