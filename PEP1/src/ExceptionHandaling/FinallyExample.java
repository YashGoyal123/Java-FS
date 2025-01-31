package ExceptionHandaling;
import java.util.Scanner;
public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {
			System.out.println(10/0);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am closing Scanner class Object");
			s.close();
		}
	}

}
