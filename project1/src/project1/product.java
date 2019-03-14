package project1;

public class product {

	String name;
	float price;
	int qty;
	float tax;
	taxpay c1;
	
	product(String name,float price,int qty,taxpay c1)
	{
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.c1=c1;
	}
	int setQuantity(int q)
	{
		this.qty=q;
		return qty;
	}
	float setPrice(float f)
	{
		this.price=f;
		return price;
	}
	double printPrice()
	{
		double tax=c1.taxamount(price,qty);
		System.out.println("billed amount"+price*qty);
		System.out.println("total amount"+((price*qty)+tax));
		return tax;
		
	}
	void setct(taxpay c1)
	{
		this.c1=c1;
	}
	
}
