package Array1;

public class PassingArray {
	public static void getArray(int a[]) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum element from an array is " + max);
	}

	public static void main(String[] args) {
		int[]b = {10,20,40,70,880};
		getArray(b);
		
		getArray(new int[]{12,30,1,110,1000});

	}

}