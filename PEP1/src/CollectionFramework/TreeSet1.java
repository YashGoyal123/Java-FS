package CollectionFramework;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(8);
		ts.add(16);
		ts.add(4);
		ts.add(20);
		for(Integer i : ts) {
			System.out.println(i);
		}
	}

}
