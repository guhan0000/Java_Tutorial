import java.util.*;
public class ScannerEx {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	String name="Guhan M"; it will work
	//	String sentence="Guhan is a good boy"; will work
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter new name");
		String newname=sc.nextLine();
		System.out.println(name);
		System.out.println(newname);
		
		
	}
}
