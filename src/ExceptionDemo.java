
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int num=10;
			int res=num/0;
			int b=9;
			System.out.println(res);
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			int b = 10;
			System.out.println(b);
		}
		
		
	
		
	}
}
