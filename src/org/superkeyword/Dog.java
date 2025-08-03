package org.superkeyword;

import javax.management.remote.SubjectDelegationPermission;

public class Dog extends Animal {
	String breed;
	String color;
	@Override
	public void makeSound()
	{
		super.makeSound();
		System.out.println("Dog Barkings");
		System.out.println(origin+"animal is");eat();
	}
	public void guard()
	{	
		System.out.println(new Dog().origin+ " dog is guarding");
		super.makeSound();// this should'nt have to be in first line
		// bcoz there is no constructor calling,
	}
	public static void main(String[] args) {
		 Animal dog=new Dog();
		dog.makeSound();
		((Dog)dog).guard();
		System.out.println();
	}

}
