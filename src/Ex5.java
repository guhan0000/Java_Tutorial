import java.util.*;
public class Ex5 {
		
	static int add(int a,int b) throws Exception
	{
		return a+b/0;
	}
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(add(1,2));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
