package Bank;
class Bank{
	double rate;

	public Bank(double rate) {
		this.rate = rate;
	}
}

class Sbi extends Bank{
	int amount = 10000;

	public Sbi(double rate, int amount) {
		super(rate);
		this.amount = amount;
	}
	
}
public class Indianbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
