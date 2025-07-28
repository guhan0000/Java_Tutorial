package com.runnable;
class LivingThings implements Runnable 
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
	
}
public class Animal{

	public static void main(String[] args) throws Exception {
		//Animal animal=new Animal();
		Thread t1=new Thread(new LivingThings());
	
	//	t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t1.join();
		for(int j=1000;j<=2000;j+=500)
		{
			System.out.println(j);
			Thread.sleep(6000);
		}
		
	}
		
	}


