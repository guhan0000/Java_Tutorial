
public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append("Guhan");
		System.out.println(sb1);
		sb1.append(" ");
		System.out.println(sb1);
		sb1.append('M');
		System.out.println(sb1);
		sb1.insert(1,"Jegan");
		System.out.println(sb1);
		System.out.println(sb1.replace(0, 2, "Gu"));
		System.out.println(sb1.delete(0,5));
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		StringBuffer sb2=new StringBuffer();
		sb2.ensureCapacity(2);
		sb2.append("cfsdf");
		System.out.println(sb2);
		
		
	}

}
