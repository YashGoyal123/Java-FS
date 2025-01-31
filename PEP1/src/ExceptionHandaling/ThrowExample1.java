package ExceptionHandaling;

public class ThrowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		try {
			if(age<21) {
				throw new AgeNotValidException("You are not Elligible for Marriage");
			}
			else {
				System.out.println("You are Elligble for marriage");
			}
		}
		catch(AgeNotValidException e) {
			System.out.println(e);
		}
	}

}
