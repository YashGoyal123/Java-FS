package Abstraction;

public interface I4 {
	void show();
	
	default void display() {
		System.out.println("I am a default method");
		showData(100);
	}
	static void getData(int a) {
		System.out.println("Your data is "+a);
	}
	private void showData(int b) {
		System.out.println("Your new data is "+b);
	}
}
