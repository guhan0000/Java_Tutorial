package org.moverloading;



public class MO2 {
	public short show(short num)
	{
		System.out.println("method 1");
		return num; 
	}
	public long show(long num)
	{
		System.out.println("method 2");
		return num;
	}
	public static void main(String[] args) {
		MO2 ed=new MO2();
		System.out.println(ed.show((short)10l));// short method is executed
		
		
		
	}


}
