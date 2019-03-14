package project1;

public class CGST implements taxpay{

	@Override
	public float taxamount(float price, int qty) {
		// TODO Auto-generated method stub
		return (float) (2.18*price*qty);
		
	}

}
