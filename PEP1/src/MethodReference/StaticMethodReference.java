package MethodReference;

@FunctionalInterface
interface Test6{
	public void display();
}
public class StaticMethodReference {

	public static void show() {
		System.out.println("I am implemented in Static way");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t = StaticMethodReference :: show;
		t.display();
	}

}
