package CollectionFramework;

import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(110);
		hs.add(100);
		hs.add(101);
		hs.add(102);
		hs.add(103);
		hs.add(200);
		hs.add(101);
		hs.add(null);
		for(Integer i : hs) {
			System.out.println(i);
		}
	}

}
