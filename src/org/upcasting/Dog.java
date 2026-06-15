package org.upcasting;

public class Dog  extends Animal{
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
	}
	void guard()
	{
		System.out.println("Dogs Guard mode on");
	}
	 void doAnimalStuff(Animal animal)
	{
		animal.makeSound();
	}
	public static void main(String[] args) {
		Dog myDog=new Dog();
		myDog.makeSound();
		myDog.guard();
//		---------------------------
		Animal myAnimal=new Dog();//upcasting
		myAnimal.makeSound();
		myDog.doAnimalStuff(myAnimal);
		
		
	}

}
