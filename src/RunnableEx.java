class Cake implements Runnable
{
	public void run()
	{
		try
		{
		System.out.println("make" +Thread.currentThread().getName());
		Thread.sleep(5000);
		System.out.println("color "+Thread.currentThread().getName());
		Thread.sleep(4000);
		System.out.println("flavor "+Thread.currentThread().getName());
			
		}catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}
}
public class RunnableEx {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++)
		{
			
			Thread t1=new Thread(new Cake());
			t1.start();
		//	System.out.println(t1.isAlive());
			t1.setName("Thread "+i);
			t1.setPriority(Thread.MAX_PRIORITY);
			System.out.println(t1.getPriority());
			t1.join();
			//System.out.println(10/0);
		}
		Thread t2=new Thread(new Cake());
		t2.start();
		Thread t1=new Thread(new Cake());
		System.out.println(t1.isAlive());
		
	}

}
