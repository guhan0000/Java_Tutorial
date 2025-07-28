package org.bank;

public class AxisBank extends BsnkInfo{
	@Override
	void deposit() {
		float percent=2;
		System.out.println(percent);
		
	}
	
	
	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		ab.deposit();
	}

}
