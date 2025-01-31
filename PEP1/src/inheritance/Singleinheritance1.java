package inheritance;
class Employee{
	int salary = 40000;
	public void EmpSalary() {
		System.out.println(salary);
	}
}
class Programmer extends Employee{
	int ta = 10000;
	int da = 15000;
	int pf = 3500;
	
	public void calculateSalary() {
		super.EmpSalary();
		float prosalary = salary+ta+da-pf;
		System.out.println("Programmer's Salary= "+prosalary);
	}
}

class Managers extends Employee{
	int ta = 10000;
	int da = 15000;
	int pf = 3500;
	
	public void calculateSalary() {
		float mansalary = salary+ta+da-pf;
		System.out.println("Manager's Salary= "+mansalary);
	}
}
public class Singleinheritance1 {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		Managers m = new Managers();
		p.calculateSalary();
		m.calculateSalary();
	}
}
