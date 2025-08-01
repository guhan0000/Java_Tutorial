package com.synchronizeddemo;

public class SynchronizedDemo implements Runnable {

	
	public static void main(String[] args) {
		SynchronizedDemo sd=new SynchronizedDemo();
		Thread t1=new Thread(sd);
		Thread t2=new Thread(sd);
		t1.start();
		t2.start();
		
		
	}
	@Override
	 	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		
	}
}
