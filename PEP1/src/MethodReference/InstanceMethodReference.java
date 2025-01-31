package MethodReference;

@FunctionalInterface
interface Test7{
	public void display();
}
public class InstanceMethodReference {
	public void show() {
		System.out.println("I am binded with instance method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodReference im = new InstanceMethodReference();
		Test7 t = im::show;
		t.display();
		
	}

}
