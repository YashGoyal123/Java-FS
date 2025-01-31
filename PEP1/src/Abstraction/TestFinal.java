package Abstraction;

abstract class TestFinalMethod{
	abstract void show();
	
	final void display() {
		System.out.println("I am Finaln method from abstract class");
	}
}

class GetFinalMethod extends TestFinalMethod{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("I am abstract method from abstract class");
	}//error if TestFinalMethod is final
	
}


public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a = 100;
//		a = 5000; //not allowed
		GetFinalMethod fm = new GetFinalMethod();
		fm.show();
		
	}

}
