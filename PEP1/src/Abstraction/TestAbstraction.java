package Abstraction;
abstract class BasicAbstract{
	public abstract void display();
	public void show() {
		System.out.println("I am non abstract method");
	}
}

class ImplementationClass extends BasicAbstract {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am abstract method");
	}
	
}
public class TestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationClass i = new ImplementationClass();
		i.display();
		i.show();
	}

}