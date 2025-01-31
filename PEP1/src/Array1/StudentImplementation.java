package Array1;
class Student {
	int sid;
	String name;
	int age;
	String std;
	
	public Student(int sid, String name, int age, String std) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.std = std;
	}
	public void display() {
		System.out.println("Student id: " + sid + " Student Name: " + name + " Student Age: " + age + " Student Class: " + std);
	}
}


public class StudentImplementation {

	public static void main(String[] args) {
		Student []s = new Student[5];
		s[0] = new Student(101, "Akshay",21,"TE");
		s[1] = new Student(102, "Akash",20,"TR");
        s[2] = new Student(103, "Sahil",23,"SE");
		s[3] = new Student(104, "Amit",22,"PE");
        s[4] = new Student(105, "Dhoni",25,"ME");
        
        s[0].display();
        s[1].display();
        s[2].display();
        s[3].display();
        s[4].display();


	}

}