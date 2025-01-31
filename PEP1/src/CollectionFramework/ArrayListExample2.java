package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

class Student{
	int sid;
	String name;
	int age;
	String std;
	public Student(int sid,String name,int age,String std) {
		this.sid=sid;
		this.std = std;
		this.name = name;
		this.age = age;
	}
}
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st = new ArrayList<Student>();
		Student st1 = new Student(101,"Abhishek",21,"TE");
		Student st2 = new Student(102,"Anant",21,"TE");
		Student st3 = new Student(103,"Akash",21,"TE");
		Student st4 = new Student(104,"Amit",21,"TE");
		Student st5 = new Student(105,"Ashish",21,"TE");
		st.add(st1);
		st.add(st2);
		st.add(st3);
		st.add(st4);
		st.add(st5);
		ListIterator<Student> li = st.listIterator();
		while(li.hasNext()) {
			Student s=li.next();
			System.out.println(s.sid+" "+s.name+" "+s.age+" "+s.std);
		}
	}

}
