package Java8;

@FunctionalInterface
interface Test1{
	void Display();
}
public class FunctionalInterfaceWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = () ->{
			System.out.println("I am Implemented");
		};
		t.Display();
	}

}
