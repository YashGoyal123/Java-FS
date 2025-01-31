package inheritance;

class Bike1{
	int speed;
	int gear;
	
	public Bike1(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void getSpeed() {
		System.out.println("The speed of bike is "+ speed);
	}
	
	public void getGear() {
		System.out.println("Bike is in "+gear+" gear");
	}
}
class Splender1 extends Bike1{
	Splender1(int gear, int speed){
		super(gear,speed);
	}
	public void getSpeed() {
		System.out.println("Speed of Splender is "+speed);
	}
	
	public void getGear() {
		System.out.println("Splender is in "+gear+" gear");
	}
}

class Boxer extends Bike1{
	Boxer(int gear, int speed){
		super(gear,speed);
	}
	public void getSpeed() {
		System.out.println("Speed of Boxer is "+speed);
	}
	public void getGear() {
		System.out.println("Boxer is in "+gear+"gear");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b = new Bike1(4,80);
		b.getGear();
		b.getSpeed();
		Splender1 s = new Splender1(4,100);
		s.getGear();
		s.getSpeed();
		Boxer b1 = new Boxer(3,50);
		b1.getGear();
		b1.getSpeed();
	}

}
