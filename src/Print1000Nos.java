class Thread10 extends Thread
{ 
	int start,end;
	public Thread10(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
	}
}
class Thread20 extends Thread
{
	int s,e;
	public Thread20(int s,int e)
	{
		this.s=s;
		this.e=e;
	}
	
	public void run()
	{
		for(int i=e;i>=s;i--)
	{
		System.out.println(i);
	}
	}
	
}

public class Print1000Nos {
	public static void main(String[] args) {
		Thread10 thread10=new Thread10(100, 500);
		thread10.start();
		Thread20 thread20=new Thread20(800,900);
		thread20.start();
		
		
	}

}
