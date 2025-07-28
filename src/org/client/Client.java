package org.client;

import org.employee.*;

public class Client extends Project {

	public void ClientId()
	{
		System.out.println(007);
	}
	private double clientBudget()
	{
		return 13400000;
	}
	
	public static void main(String[] args) {
		Client c=new Client();
		c.ClientId();
		c.projectid();
		Project p=new Project();
		p.projectid();
		//c.duration(); extend level is not accesible
		//p.duration(); object level is not accessible
	//	p.resources(); object level not visible
		c.resources();
	}
}

