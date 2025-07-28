class Tea extends Thread
{
	public void run()
	{
		System.out.println("Pouring Milk"+Thread.currentThread().getId());
		System.out.println("Adding powder"+Thread.currentThread().getId());
		System.out.println("Adding Sugar"+Thread.currentThread().getId());
	}
}
public class Cooking {
	
		public static void main(String[] args) {
		Tea t1=new Tea();
		for(int i=0;i<4;i++)
		{
					t1.start();

		}
	}
	

}
