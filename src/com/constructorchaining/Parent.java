package com.constructorchaining;

public class Parent {
	public Parent()
	{
		System.out.println("Parent's default constructor");
	}
	public Parent(String name)
	{
		System.out.println("Parent's String "+name);
	}
	public Parent(char ch)
	{
		System.out.println(ch);
	}
	
	public static void main(String[] args) {
		
		//new Parent();
		new Parent("guhan");
	}

}
