package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new ArrayList();//non generic
		List <Integer> l2 = new ArrayList<Integer>();//generic
		l1.add(12);
		l1.add(13);
		l1.add(10);
		l1.add(10);
		l1.add("Akash");
		l1.add("Prakash");
		l1.add(null);
		for(Object i : l1) {
			System.out.println(i);
		}
		l2.add(10);
		l2.add(13);
		l2.add(15);
		l2.add(22);
		l2.add(null);
		for(Integer i : l2) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		System.out.println(l2.contains(22));
		List <Integer> l3 = new ArrayList<Integer>();
		l3.add(100);
		l3.add(200);
		l3.add(300);
		List <Integer> l4 = new ArrayList<Integer>(l2);
		l4.addAll(l3);
		for(Integer i : l4) {
			System.out.println(i);
		}
		
	}

}
