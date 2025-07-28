package org.employee;

public class Employee extends Project {
	public void empid()
	{
		System.out.println(101);
	}
	private double empsalary()
	{
		return 1200000;
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.projectid();
		Project p=new Project();
		p.projectid();
		System.out.println(e.empsalary());
		//e.projectname() extend level private is not visible
		// p.projectname(); object level private method is not visible
		p.duration(); // object level accessible
		e.duration();// extend level also accessible
		e.resources();
		p.resources();
	}

}
