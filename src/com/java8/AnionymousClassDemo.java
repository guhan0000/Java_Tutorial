package com.java8;

class Animal {
	void makeSound() {
		System.out.println("Animal Sounds");
	}
}
public class AnionymousClassDemo {
	
	public static void main(String[] args) {
		Animal animal=new Animal() {
			void makeSound() {
				System.out.println("Barks");
			}
		};
		animal.makeSound();
		AnonymousClassDemo2 acd2=new AnonymousClassDemo2() {
			
			@Override
			public void function() {
				// TODO Auto-generated method stub
				System.out.println("function of an interface");
				
			}
		};
		acd2.function();
	}

}
