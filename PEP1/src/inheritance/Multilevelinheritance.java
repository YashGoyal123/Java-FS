package inheritance;

class Vehicle{
	public void running() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	public void running() {
		System.out.println("Bike is running very fast");
	}
}
class Splender extends Bike{
	public void running() {
		System.out.println("Splender bike is running very smooth");
	}
	
}
public class Multilevelinheritance {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bike b = new Bike();
		Splender s = new Splender();
		v.running();
		b.running();
		s.running();
	}
}
