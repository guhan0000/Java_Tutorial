package org.regex;

import java.time.LocalDate;

public class Employee {
	
	private String empName;
	private String empDept;
	private LocalDate empJoinDate;
	private double empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public LocalDate getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(LocalDate empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public Employee(String empName, String empDept, LocalDate empJoinDate, double empSalary) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empJoinDate = empJoinDate;
		this.empSalary = empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}
