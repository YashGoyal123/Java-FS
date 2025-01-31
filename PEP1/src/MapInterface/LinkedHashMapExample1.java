package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(101, "Ashish");
		hm.put(102, "Amit");
		hm.put(103, "Anil");
		hm.put(104, "Ajay");
		hm.put(null, null);
		for(Map.Entry en : hm.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
