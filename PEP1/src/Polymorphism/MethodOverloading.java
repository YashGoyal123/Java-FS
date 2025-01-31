package Polymorphism;

public class MethodOverloading {
	
	public void display() {
		System.out.println("I am first method inside class");
	}

	public void display(int a) {
		System.out.println("I am second method in class and value of a = "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1 = new MethodOverloading();
		m1.display();
		m1.display(10);
	}

}
