package com.synchronizeddemo;

class Thr1 implements Runnable
{
	 synchronized void display()
	{
		for(int i=0;i<9;i++)
		{
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
		
	}
}

public class SyncEx2 {
	public static void main(String[] args) {
		Thr1 sharedObj=new Thr1();
		Thread t1=new Thread(sharedObj);
		Thread t2= new Thread(sharedObj);
		t1.start();
		t2.start();
	}
}
