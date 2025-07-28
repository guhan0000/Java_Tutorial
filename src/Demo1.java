
public class Demo1 extends Thread {
	
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Running");
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void update()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		demo1.run();
		
		
	}

}
