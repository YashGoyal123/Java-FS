package Abstraction;


class TestInterfaceI1 implements I1{
	@Override
	public void display() {//compulsory public
		System.out.println("I am override method from I1 interface");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am show method from I2");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfaceI1 ti = new TestInterfaceI1();
		ti.display();
		ti.show();
	}

}
