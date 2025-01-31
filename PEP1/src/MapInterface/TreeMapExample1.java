package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		tm.put(1001, "Java");
		tm.put(1002, "JavaScript");
		tm.put(1003, "TypeScript");
		tm.put(1004, "Angular");
		tm.put(1005, "ReactJS");
		tm.put(1006, null);
		for(Map.Entry<Integer,String> em : tm.entrySet()) {
			System.out.println(em.getKey()+" "+em.getValue());
		}
	}

}
