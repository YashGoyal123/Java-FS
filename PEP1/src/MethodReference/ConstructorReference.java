package MethodReference;

@FunctionalInterface
interface Test8{
	public void display(String str);
}
public class ConstructorReference {
	public ConstructorReference(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 t = ConstructorReference::new;
		t.display("I like TypeScript");
	}


}
