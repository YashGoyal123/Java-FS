package ExceptionHandaling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {

	public static void show() throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("C:\\Users\\yashg\\OneDrive\\Desktop\\Java FS\\PEP1\\src\\ExceptionHandaling\\test.txt"));
//		while(sc.hasNext()){
//			//Scanner class method)
//			System.out.println(sc.next());
//		}
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			show();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
