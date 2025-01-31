package StringPackage;

public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "  Welcome to LPU  ";
		System.out.println(str1);
		String str = "Welcome to LP";
		String[] words = str.split("  "); 
        for (String word : words) {
            System.out.println(word); 
        } 
		String str2 = new String("Welcome to Punjab");
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		
		
		String str3 = "LPU";
		String str4 = "LPU";
		System.out.println(str3==str4);//both the strings are created on string literal pull
		System.out.println(str3.equals(str4));
		System.out.println(str3.compareTo(str4));
		
		
		String str5 = new String("LPU");
		System.out.println(str4.equals(str5));
		System.out.println(str2==str5);
		System.out.println(str2.equals(str5));
		System.out.println(str2.compareTo(str5));
		
		
		String str6 = new String("Welcome to lpu");
		System.out.println(str1.equalsIgnoreCase(str6));
		System.out.println(str1.startsWith("W"));
		System.out.println(str1.startsWith("w"));
		System.out.println(str1.endsWith("U"));
		System.out.println(str1.endsWith("u"));
		System.out.println(str1.length());
		System.out.println(str1.trim());
		System.out.println(str1.trim().length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(13,17));
		System.out.println(str1.replaceAll("to", "from"));
		System.out.println(str1.charAt(13));
		
		
		String str7 = new String("JavaScript");
		String str8 = str7.toLowerCase();
		int count = 0;
		for(int i = 0; i<str8.length();i++) {
			if(str8.charAt(i)=='a'||str8.charAt(i)=='e'||str8.charAt(i)=='i'||str8.charAt(i)=='o'||str8.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
