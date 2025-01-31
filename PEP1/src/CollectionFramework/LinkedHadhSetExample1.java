package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHadhSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(12);
//		for(Integer i : lhs) {
//			System.out.println(i);
//		}
//		lhs.forEach((n)->System.out.println(n));//lambda expression
		lhs.forEach(System.out :: println);
	}

}
