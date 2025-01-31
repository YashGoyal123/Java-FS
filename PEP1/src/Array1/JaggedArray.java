package Array1;

public class JaggedArray {

	public static void main(String[] args) {
		int [][] jagged = new int[5][];
		jagged[0] = new int[1];
		jagged[1] = new int[2];
		jagged[2] = new int[3];
		jagged[3] = new int[2];
		jagged[4] = new int[5];
		
		int item = 0;
		for(int i = 0; i < jagged.length; i++) {
			for(int j = 0; j <jagged[i].length; j++) {
				jagged[i][j]=item++;
				System.out.print(jagged[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}