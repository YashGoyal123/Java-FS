package Java8;

@FunctionalInterface
interface Test2{
	public void square(int n);
}
public class LambdaWithSingleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = n ->{
			System.out.println(n*n);
		};
		t.square(21);
	}

}
