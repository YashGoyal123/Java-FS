package SwitchCase;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchCaseCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 for ArrayList");
		System.out.println("Enter the number 2 for PriorityQueue");
		System.out.println("Enter the number 3 for HashSet");
		System.out.println("Enter the number 4 for Exit");
		int n = sc.nextInt();
		switch(n){
		case 1  : 
			System.out.println("Enter 1 for insertion");
			System.out.println("Enter 2 for deletion");
			System.out.println("Enter 3 for peek");
			int a = sc.nextInt();
			switch(a) {
			case 1 :
				ArrayList<Integer> al = new ArrayList<>();
				System.out.println("Enter the number to insert: ");
				int num = sc.nextInt();
				al.add(num);
				System.out.println("Inserted: " + num);
				for(int i : al) {
					System.out.println(i);
				}
			}
		}
		sc.close();

	}

}
