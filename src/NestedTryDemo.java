
public class NestedTryDemo {
	
	public static void main(String args[])
	{
	try
	{
	int a[] = {1,2,3,4};
	//int x = a[2]/0;
	
	try
	{
	//System.out.println(a[10]);
	String string=null;
	System.out.println(string.length());
	}catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Extracting a element not in a list");
	}
	}catch(Exception e1){
	System.out.println(e1);
	}
	}
	

}
