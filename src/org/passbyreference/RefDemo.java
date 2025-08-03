package org.passbyreference;
class Box1
{
	int height;
	int breath;
	int length;
	public Box1(int length,int breath,int height)
	{
		this.length=length;
		this.breath=breath;
		this.height=height;
	}
	public boolean isEqual(Box1 b)
	{
		b.length++;
		if(height==b.height && length==b.length && breath==b.breath)
				return true;
		else
			return false;
	}
}
public class RefDemo {
	
	public static void main(String[] args) {
		Box1 b1=new Box1(10, 20, 30);
//		Box1 b2=new Box1(1, 2, 3);
//		Box1 b2=b1;
//		System.out.println(b1==b2);
		Box1 b2=new Box1(10, 20, 30);
		boolean equal = b1.isEqual(b2);
		System.out.println(equal);
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		
	}
	

}
