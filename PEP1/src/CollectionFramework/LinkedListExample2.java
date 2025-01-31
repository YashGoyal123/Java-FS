package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Sachin");
		l1.add("Virendra");
		l1.add("mahendra");
		l1.add("Saurabh");
		l1.add("Hardik");
		for(String s : l1) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		Iterator <String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------");
		ListIterator <String> litr = l1.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("---------------------------------------------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
