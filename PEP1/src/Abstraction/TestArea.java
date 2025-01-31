package Abstraction;
abstract class Shape1{
	public abstract void area();
	public abstract void perimeter();
}
class Circle1 extends Shape1{
float radius = 10.10f;
float pi = 3.14f;
float area, perimeter;
	@Override
	public void area() {
		area = pi*radius*radius;
		System.out.println("Area of circle is  "+area);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter = 2*pi*radius;
		System.out.println("Perimeter of circle is "+perimeter);
	}
	
}
public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 t = new Circle1();
		t.area();
		t.perimeter();
	}

}
