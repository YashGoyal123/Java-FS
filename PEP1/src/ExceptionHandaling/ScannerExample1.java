package ExceptionHandaling;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		System.out.println("Your id is "+id);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your name is "+name);
//		String name = sc.nextLine();
//		System.out.println("Your name is "+name);
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
	}

}
