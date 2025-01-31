package ExceptionHandaling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(new File("C:\\Users\\yashg\\OneDrive\\Desktop\\Java FS\\PEP1\\src\\ExceptionHandaling\\test.txt"))){
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe);
		}
//		System.out.println(sc.nextLine());
	}

}
