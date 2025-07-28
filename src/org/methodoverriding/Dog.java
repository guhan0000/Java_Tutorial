package org.methodoverriding;

 class Dog extends Animal{
	  void bark() {
		// TODO Auto-generated method stub
		 System.out.println("Dog is barking");
	}
	 @Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog is running");
	}
	 @Override
	int count(int num2) {
		 System.out.println("the count is");
		return num2;
	}
	@Override
	public void animalType(String type) {
		if(type.equalsIgnoreCase("domestic"))
		{
			System.out.println(type+"belongs to house");
		}
		else if(type.equalsIgnoreCase("wild"))
		{
			System.out.println(type+"belongs to forest");
		}
		else
		{
			System.out.println("Not found");
		}
	}
public static void main(String[] args) {
	//Dog d=new Dog();
	//d.bark();
	Animal a=new Dog();
	a.move();
	a.eat();
	a.move();
	a.animalType("domestic");
	System.out.println(a.count(2));
	//a.bark(); cause error
	
}
}
