class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(8000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Bye");
		}
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		
		thread1.start();
		thread1.join();
		System.out.println("end of the program");
	
	//thread2.start();
	}
	
	

}
