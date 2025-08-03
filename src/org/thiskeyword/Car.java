package org.thiskeyword;

public class Car {
	private String brand;
	private String model;
	private String fuel;
	private int seats;
	public Car()
	{
		this(4);
		
		
		
	}
	public Car(int capacity)
	{
		
		 seats=capacity;
		 System.out.println("This car has "+seats+"seats");
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{

		return this.brand;
	}
	
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.setBrand("hyundai");
		System.out.println(myCar.getBrand());
		System.out.println(myCar.seats);
		
		
	}
	
}
