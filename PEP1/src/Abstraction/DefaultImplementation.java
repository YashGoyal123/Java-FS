package Abstraction;

class TestDefault implements I4  {
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am abstract show method from Interface");
		
	}
	
}
public class DefaultImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefault td = new TestDefault();
		td.display();
		td.show();
		I4.getData(10);
	}

}
