package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <Integer> pq = new PriorityQueue <Integer>();
		pq.add(10);
		pq.add(2);
		pq.add(12);
		pq.add(25);
		pq.add(13);
		pq.offer(14);
		//pq.add(null);
		System.out.println(pq.peek());
		System.out.println("-----------------------------------");
		System.out.println(pq.poll());//remove and tell the topmost of the stack
		System.out.println("-----------------------------------");
		for(Integer i : pq) {
			System.out.println(i);
		}
	}

}
