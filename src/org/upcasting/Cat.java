package org.upcasting;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		//super.makeSound();// calls parent class makeSound method
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Cat myCat=new Cat();
		Dog myDog=new Dog();
		Cow myCow=new Cow();
		Animal ani=new Cat();
		
		myCat.makeSound();
		
		ArrayList<Animal>zoo=new ArrayList<>();
		zoo.add(myDog);
		zoo.add(myCat);
		//zoo.add(myCow); causes error because cow is not inherited from Animal class
		for(Animal animal : zoo)
		{
			animal.makeSound();
		}
		System.out.println(myCat instanceof Animal);
		System.out.println(ani instanceof Animal);
	}

}
