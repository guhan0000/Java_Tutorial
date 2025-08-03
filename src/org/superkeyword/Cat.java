package org.superkeyword;

public class Cat extends Animal {
	String color;
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	 public Cat(int age ,double price) {
		// TODO Auto-generated constructor stub
		 super(age,price);
		 this.color=color;
		
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		//Cat cat=new Cat(1,5000);
//		cat.makeSound();
//		cat.eat();
		System.out.println(cat.age+""+cat.color+cat.origin+cat.price);
		
	}
	

}
