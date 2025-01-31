package StringPackage;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer sb1 = new StringBuffer();
//		StringBuffer sb2 = new StringBuffer();
//		StringBuffer sb1 = new StringBuffer("Hi");
		StringBuffer sb1 = new StringBuffer("Hioooooooooooooooo");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.append(" I like JavaScript"));
		System.out.println(sb1.reverse());
		System.out.println(sb2.indexOf("H"));
		System.out.println(sb2.delete(1, 3));
	}

}
