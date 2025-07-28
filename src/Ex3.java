import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try
		{
			System.out.println("enter a number");
			int num=scanner.nextInt();
			System.out.println(num/0);
			
		}catch (InputMismatchException|ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("general exception: "+e);
		}
	}
	

}
