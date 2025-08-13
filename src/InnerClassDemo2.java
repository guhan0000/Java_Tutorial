class  Outer1
{
	static int num=10;
	 void outerDisplay() {
		// TODO Auto-generated method stub
		 System.out.println("outer display"+num);

	}
	static class Inner1
	{
		void display()
		{
			System.out.println("static inner class");
			System.out.println(num);
		}
		
	}
}
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer1 outer1=new Outer1();
		
		Outer1.Inner1 inner1=new Outer1.Inner1();
//		inner1.display();
//		Outer1.num=22;
		System.out.println("--------------------Outer1 class----------------------------");
		
		System.out.println(Outer1.num);
		System.out.println("--------------------Inner1 class----------------------------");
		inner1.display();
		
	}
}
