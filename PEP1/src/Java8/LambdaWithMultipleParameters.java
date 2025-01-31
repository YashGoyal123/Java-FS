package Java8;

@FunctionalInterface
interface Test4{
	public void show(int id, String name);
}
public class LambdaWithMultipleParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = (id,name) -> {
			System.out.println("ID: "+id+" "+name);
		};
		t.show(101, "Yash");
	}

}
