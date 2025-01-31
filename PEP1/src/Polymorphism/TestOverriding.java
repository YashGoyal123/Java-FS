package Polymorphism;

class Dimension{
	public void getDimension() {
		System.out.println("Getting a dimension");
	}
}

class TwoD extends Dimension{
	@Override
	public void getDimension() {
		System.out.println("It's 2 dimension class");
	}
}
public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension d = new Dimension();
		d.getDimension();
		TwoD t = new TwoD();
		t.getDimension();
	}

}
