package com.Concreate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contract_emp3")
@PrimaryKeyJoinColumn(name="id")
public class ContractEmployee extends Employee {
	@Column(name="rate_per_hr")
	int rate_per_hr;
	@Column(name="No_periods")
	int No_periods;
	public int getRate_per_hr() {
		return rate_per_hr;
	}
	public void setRate_per_hr(int rate_per_hr) {
		this.rate_per_hr = rate_per_hr;
	}
	public int getNo_periods() {
		return No_periods;
	}
	public void setNo_periods(int no_periods) {
		No_periods = no_periods;
	}
}
