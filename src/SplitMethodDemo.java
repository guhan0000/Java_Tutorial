
public class SplitMethodDemo {
	
	public static void main(String[] args) {
		String string="guhan@solverminds.com";
		String[] split = string.split("@");
	//	System.out.println(string);
		for(String str:split)
		{
			System.out.println(str);
		}
		
	}

}
