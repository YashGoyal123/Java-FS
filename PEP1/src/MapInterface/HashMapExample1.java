package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Ashish");
		hm.put(102, "Amit");
		hm.put(103, "Anil");
		hm.put(104, "Ajay");
		for(Map.Entry en : hm.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
