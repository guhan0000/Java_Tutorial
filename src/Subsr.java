import java.util.*;
public class Subsr {
	
	static int substrtest(String str,String pattern)
	{
		int indexOf = str.indexOf(pattern);
		return indexOf;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(substrtest("Hello World", "Hello"));
		
	}
}
