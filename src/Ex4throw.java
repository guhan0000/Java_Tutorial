import javax.management.RuntimeErrorException;

public class Ex4throw {
	void check(int age)
	{
		if(age>18)
		{
			System.out.println("Age is valid");
		}
		else
			throw new NumberFormatException("Invalid Age");
	}
	public static void main(String[] args) {
		try
		{
			Ex4throw ex4throw=new Ex4throw();
			ex4throw.check(17);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
