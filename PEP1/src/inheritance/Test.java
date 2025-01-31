package inheritance;
class Person{
	int id;
	String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}//constructor
	
}

class Student extends Person{
	int grade;

	public Student(int id, String name, int grade) {
		super(id, name);
		this.grade = grade;
	}
	public void display() {
		System.out.println("id: "+id+" Name: "+name+" Grade: "+grade);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student x = new Student(1,"Yash",9);
		x.display();
	}

}
