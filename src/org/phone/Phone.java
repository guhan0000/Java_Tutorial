package org.phone;

public class Phone {
	private void phoneInfo(long phno, String operator) {
		System.out.println("Method1");
		System.out.println(phno+"\t"+operator);
		// TODO Auto-generated method stub
		
	}
	private void phoneInfo(String operator,long phno) {
		// TODO Auto-generated method stub
		System.out.println("Method2");
		System.out.println(phno+"\t"+operator);

	}
	public static void main(String[] args) {
		Phone p1=new Phone();
		long phno=9638527410l;
		String operator="Airtel";
		p1.phoneInfo(phno, operator);
		p1.phoneInfo(operator,phno);
	}

}
