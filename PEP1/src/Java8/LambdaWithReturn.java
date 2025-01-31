package Java8;

@FunctionalInterface
interface Test3{
	public String Display();
}
public class LambdaWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test3 t = () ->{
//			return "I like JavaScript More!";
//		};
		Test3 t = () -> "I like JavaScript";
		System.out.println(t.Display());
	}

}
