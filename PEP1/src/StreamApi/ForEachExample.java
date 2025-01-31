package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Consumer<Integer> con = (Integer t)-> {
				// TODO Auto-generated method stub
				System.out.println(t);
		};
		data.forEach(con);
//		data.forEach(n->System.out.println(n));

	}

}
