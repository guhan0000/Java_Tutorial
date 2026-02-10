
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		String space=" ";
//		for(int k=num-1;k>=0;k--)
//		{
//			System.out.println(space);
//		}
		
		for(int i=num-1;i>=0;i--)
		{
		
			for(int j=i+1;j<2*num-i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		

	}

}
