package org.add;

public class GreensTech {
	private void greensOmr(int count) {
		// TODO Auto-generated method stub
		System.out.println("Method1");
		System.out.println(count);

	}
	private void greensOmr(long pincode) {
		// TODO Auto-generated method stub
		System.out.println("Method2");
		System.out.println(pincode);

	}
	private void greensOmr(String place,int pincode) {
		// TODO Auto-generated method stub
		System.out.println("Method3");
		System.out.println(pincode+"\t"+place);

	}
	private void greensOmr(int pincode,String place) {
		// TODO Auto-generated method stub
		System.out.println("Method4");
		System.out.println(pincode+"\t"+place);}

	public static void main(String[] args) {
		GreensTech gt=new GreensTech();
		gt.greensOmr(3);
		gt.greensOmr(620258l);
		gt.greensOmr("Navalur",62025);
		gt.greensOmr(625,"Navalur");
		
	}

}
