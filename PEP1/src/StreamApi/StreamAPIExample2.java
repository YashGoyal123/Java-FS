package StreamApi;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Predicate<Integer> predi = new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t%2==0;
//			}
//		};
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> s = data.stream();
//		s.filter(predi).map(n->n*2).forEach(n->System.out.println(n)); 
//		s.filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n)); 
//		s.filter(n->n%2==0).map(n->n*2).forEach(System.out::println); 
		int addition = s.filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b); 
		System.out.println(addition);
		
		
		Stream<Integer> s1 = data.stream();
		System.out.println(s1.reduce(0,(a,b)->a>b?a:b));
		
		Stream<Integer> s2 = data.stream();
		System.out.println(s2.reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b));
	}

}
