package CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v = new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.add(13);
		v.addElement(40);
		Enumeration <Integer> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
