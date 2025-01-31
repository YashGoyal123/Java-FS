package ExceptionHandaling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am before divdebyZero exception");
		try {
			try {
				System.out.println(10/0);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println("I am after Arithmetic Exception");
			String str = null;
			System.out.println("Length of the string is "+str.length());
		}
		catch(NullPointerException npe) {
			System.out.println(npe);
		}
		System.out.println("I am at end of the code");
	}

}
