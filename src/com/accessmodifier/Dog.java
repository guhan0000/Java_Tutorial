package com.accessmodifier;

public  class Dog extends Animal {
	final String type="omnivores";
	final static String color="black";
	static int tail=1;
	protected String origin="USA";
	final int legs()
	{
		return 4;
	}
	static void bark()
	{
		System.out.println("Barking");
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		d.run();
		System.out.println(d.legs());
		System.out.println(d.type);
		System.out.println(d.color);
		System.out.println(color);
	}

}
