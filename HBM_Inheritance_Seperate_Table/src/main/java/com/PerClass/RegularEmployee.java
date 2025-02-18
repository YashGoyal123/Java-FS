package com.PerClass;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "regular_emp2")
@AttributeOverrides({
	@AttributeOverride(name = "id", column=@Column(name="id")),
	@AttributeOverride(name = "name", column = @Column(name= "name"))
})

public class RegularEmployee extends Employee {
	@Column(name="salary")
	float salary;
	@Column(name="bonus")
	int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	

}