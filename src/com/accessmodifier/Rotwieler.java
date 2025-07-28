package com.accessmodifier;

public class Rotwieler{

	public static void main(String[] args) {
		Dog d=new Dog();
		Rotwieler r=new Rotwieler();
		d.eat();
		d.legs();
		d.run();
		System.out.println(d.color);
		System.out.println(d.type);
		System.out.println(d.tail);
		System.out.println(Dog.tail);
			Dog.bark();
			System.out.println(d.origin);
		
	}
}
