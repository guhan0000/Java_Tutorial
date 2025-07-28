package com.constructors;

public class Animal {
	
	int num;
	char chr;
	Animal()
	{
		this("guhan");
		System.out.println("Animal Constructor");
	}
	Animal(String name)
	{
		this(3,'M');
		System.out.println(name);
	}
	public Animal(int legs, char gender)
	{
		System.out.println("legs: "+legs+"\t"+"gender: "+gender);
	}
	 void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");

	}
	public static void main(String[] args) {
		
	//	Animal a=new Animal();
		new Animal();
//		new Animal("lion");
//		Animal ani;
//		ani=new Animal();
		
		///ani.eat();
	//	new Animal(4,'M');
		//System.out.println(ani.num);
		//System.out.println(ani.chr);
	}

}
