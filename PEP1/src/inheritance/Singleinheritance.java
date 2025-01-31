package inheritance;

class Shape{
	int radius;
	float pi = 3.14f;
	int side;
	public void area(int radius,float pi) {
		System.out.println("Calculate area of Circle: ");
	}
}

class Circle extends Shape{
	float area;
	public void CalculateArea(int radius, float pi){
		area = pi*radius*radius;
		System.out.println("Area of Circle is "+area);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.area(10,3.14f);
		c.CalculateArea(10,3.14f);
	}

}
