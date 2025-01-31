package Array1;

public class ArrayExample1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 12;
		a[2] = 15;
		a[3] = 18;
		a[4] = 21;
		
		int min = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(min>a[i]) {
				min = a[i];
			};
			
}
		System.out.println(min);
		
		//int b[] = {10,20,30,40,50};
		
		//for(int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
//}
		
		//for(int i = 0; i < b.length; i++) {
			//System.out.println(b[i]);
//}
		}

}