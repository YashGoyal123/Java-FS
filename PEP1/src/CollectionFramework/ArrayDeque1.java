package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adq = new ArrayDeque <Integer>();
		adq.add(10);
		adq.add(11);
		adq.offerFirst(13);
		adq.offerLast(14);
		adq.add(15);
		System.out.println(adq.peekLast());
		System.out.println("-----------------------------------------");
		for(Integer i : adq) {
			System.out.println(i);
		}
	}

}
