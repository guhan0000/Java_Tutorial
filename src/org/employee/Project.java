package org.employee;

public class Project {
public void projectid()
{
	System.out.println("1001");
}
private void projectname()
{
	System.out.println("Netbanking");
}
void duration()
{
	System.out.println("8 months");
}
protected void resources()
{
	System.out.println("500");
}
public static void main(String[] args) {
	Project p=new Project();
	p.projectid();
	p.projectname();
	p.resources();
}
}
