package ExceptionHandaling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("/test.txt"));
//			throw new FileNotFoundException();
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe);
		}
	}

}
