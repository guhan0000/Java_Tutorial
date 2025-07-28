import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class StringsDemo {

	public static void main(String[] args) {
		String str1="Java";
		String str2="Python";
//	
//		System.out.println(str1==str2);
//		String s1=new String("Python");
//		String s2=new String("Python");
//		String str3="Python";
//		System.out.println(s1==s2);
//		System.out.println(str3==s1);
//		System.out.println(s1.equals(str3));
		
//------------String methods----------------------
//		System.out.println(str1.length());
//		//System.out.println(str1.concat("Program"));
//		String str3=str2.concat("Prooject");
//		str1=str1.concat(str3);
//		System.out.println(str3);
//		str1=str1.concat("Python");
//		System.out.print(str3.indexOf('t'));
//		System.out.println(str3.indexOf("P"));
//		System.out.println(str3.indexOf('o',8));
//		System.out.println(str3.indexOf("Python"));
		
//		String string="GeeksGsfGeeksorGeeks";
//		System.out.println(string.indexOf("Geeks"));
//		System.out.println(string.indexOf("Geeks",1));
//		System.out.println("len: "+string.length());
//		System.out.println(string.lastIndexOf('s'));
//		
//		System.out.println(string.lastIndexOf("Geeks",12));
		
//		String string=new String("GeeksforGeeks");
//		String string2="GEEKSForGeeKS";
////		System.out.println(string.equalsIgnoreCase(string2));
////		System.out.println(string.toLowerCase());
////		System.out.println(string2.toUpperCase());
//		/*System.out.println(string.startsWith("Gee"));
//		System.out.println(string.startsWith("G"));
//		System.out.println(string.startsWith("k"));
//		System.out.println(string.startsWith("sfor",4));*/
//		System.out.println(string.endsWith("Geeks"));
//		System.out.println(string.endsWith("Geeks",8));// not possible
//		
//		StringBuffer sBuffer=new StringBuffer("Java Program");
//		String s2="Program";
////		System.out.println(sBuffer);
//		String newstr=sBuffer.toString();
//		System.out.println(newstr);
		//System.out.println(newstr.contains(s2));
		
// --------------toCharArray-----------------------------
//	char ca[]=newstr.toCharArray();
//	for(char ch:ca)
//	{
//		System.out.println(ch);
//	}
//		
		
//	String s1="Java Program     ";
//	System.out.println(s1.length());
//	String s2=s1.trim();
//	String s3="Java Program";
//	System.out.println("s1 "+s1+" len "+s1.length());
//	System.out.println("s2 "+s2+" len "+s2.length());
//	System.out.println(s1==s2);
//	
		String s1=new String("Geeks");
		String s2=new String("geeksg");
		int compareTo = s1.compareTo(s2);
		System.out.println(compareTo);
		int compareToIgnoreCase = s1.compareToIgnoreCase(s2);
		System.out.println(compareToIgnoreCase);
		
	}
}
