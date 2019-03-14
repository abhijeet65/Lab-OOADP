package project1;

public class SGST implements taxpay {

	@Override
	public float taxamount(float price, int qty) {
		// TODO Auto-generated method stub
		return (float) (2.0*price*qty);
		
	}
}
