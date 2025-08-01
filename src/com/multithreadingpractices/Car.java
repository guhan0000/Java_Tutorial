package com.multithreadingpractices;
class Bike implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("Bike "+i);
		}
		
	}
	
}

public class Car extends Thread {
	
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Car is running");
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	void ac()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Ac is running");
		}
		
	}
	void music()
	{
		System.out.println("Music System is running");
	}
	void engine()
	{
		System.out.println("engine is running");
	}
	public static void main(String[] args) throws InterruptedException {
		Car c1=new Car();
		c1.start();
		//c1.join();
	for(int i=0;i<5;i++)
	{
		System.out.println("Main thread");
	}
	Bike b1=new Bike();
	Bike b2=new Bike();
	Thread thread1=new Thread(b1);
	thread1.start();
	
	
	
	
		
		
	}
}
