
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sBuilder=new StringBuilder();
		
		sBuilder.append("guhan");
		
		sBuilder.append("is a great guy");
		System.out.println(sBuilder);
		sBuilder.insert(9, "one of the ");
	//	sBuilder.toString();
		System.out.println(sBuilder.charAt(0));
		
	}

}
