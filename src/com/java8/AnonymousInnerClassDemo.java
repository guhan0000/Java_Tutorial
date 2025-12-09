package com.java8;

interface Car{
	
	void getFuel();
}


public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		Car car=new Car(){
		public void getFuel() {
			System.out.println("Fuel: Petrol");
		}
		
	};
	car.getFuel();
	}
	
	
	

}
