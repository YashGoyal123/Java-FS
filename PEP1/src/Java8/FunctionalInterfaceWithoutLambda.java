package Java8;
@FunctionalInterface
interface Test{
	public void Display();
}
public class FunctionalInterfaceWithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test() {

			@Override
			public void Display() {
				// TODO Auto-generated method stub
				System.out.println("I am implemented");
			}
			
		};
		t.Display();
	}

}
