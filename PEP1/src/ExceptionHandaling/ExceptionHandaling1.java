package ExceptionHandaling;

public class ExceptionHandaling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("stat1");
		System.out.println("stat2");
		System.out.println("stat3");
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("stat4");
		System.out.println("stat5");
		System.out.println("stat6");
	}

}
