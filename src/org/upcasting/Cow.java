package org.upcasting;

public class Cow extends Animal {
	 String breed="Jersey";
	 int age=4;
	 String color="white";
	void makeSound()
	{
		System.out.println("maaa");
	}
	void produce()
	{
		System.out.println("Milk");
	}
	public static void main(String[] args) {
		Cow myCow=new Cow();
		//System.out.println(myCow instanceof Animal);
		Animal animal=new Cow();
		myCow.produce();
//		cow.produce(); error bcoz Animal cow Animal class doesn't have produce method
		//Cow cow2=(Cow)cow;
		animal.makeSound();
		((Cow)animal).produce();
		
//		(Cow)cow.breed;
		System.out.println(myCow.age + " "+ myCow.breed);
		
	
		
		
		
		
	}
}
