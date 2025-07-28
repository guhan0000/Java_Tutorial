
public class Ex2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			int arr[]= {10};
			String string="java";	
			System.out.println(arr[2]);
			System.out.println(string.charAt(10));
			
			
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			
	}//catch (ArithmeticException e1) {
//			// TODO: handle exception
//			System.out.println(e1.toString());
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("general exception"+e);
		}
		
		finally {
			System.out.println("program ends");
		}
	}
}
