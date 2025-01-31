package Abstraction;

public class BankImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		HDFC h = new HDFC();
		System.out.println(s.getRateOfInterest());
		System.out.println(h.getRateOfInterest());
	}

}
