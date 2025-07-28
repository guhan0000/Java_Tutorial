package org.jumpstmnts;

public class JumpEx {

	public static void main(String args[])
	{
		int n=5;
		loop1:
		for(int i=0;i<n;i++)
		{
			System.out.println("i:"+i);
			
			for(int j=0;j<n;j++)
			{
				if(j==3)
				{
					break loop1;
				}
				System.out.println("j:"+j);
			}
		}
		
	}
}
