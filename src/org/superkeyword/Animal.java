package org.superkeyword;

public class Animal {
		int age;
		String origin="India";
		double price;
		public Animal() {
			// TODO Auto-generated constructor stub
		}
		public Animal(int age,double price) {
			this.age=age;
			this.price=price;
		}
		
		public void makeSound() {
			// TODO Auto-generated method stub
			System.out.println("***Animal-Noises***");

		}
		void eat()
		{
			System.out.println("Animal is eating");
		}
		
}
