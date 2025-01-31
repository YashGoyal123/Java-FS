
class xyz{
	int a;
	float b;
	public xyz(int a, float b) {
		this.a = a;
		this.b = b;
	}
	public xyz(float b, int a) {
		this.b = b;
		this.a = a;
	}
	
	public static void main(String[] args) {
		xyz x = new xyz(10,20);
	}
}