package org.emp;

public class EmployeeDetails {
	public int empId(int id)
	{
		System.out.println("Method 1");
		return id;
	}
	private String empId(String id)
	{
		System.out.println("Method 2");
		return id;
	}
	/*public byte empId( byte id1,byte id2) {
		System.out.println("method 6");
		return id1,id2;
	}*/
	public short empId(short id1)
	{
		System.out.println("Method 3");
		return id1;
	}
	public byte empId(byte id, byte id2)
	{
		System.out.println("Method 4");
		return (byte) (id+id2);
		
	}
	public long empId(long id1,long id2)
	{
		System.out.println("Method 5");
		return id1+id2;
	}
	public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails();
		 System.out.println(ed.empId(12l,22l));
		System.out.println(ed.empId((short)10));
		System.out.println(ed.empId((byte)1,(byte)2));
		System.out.println(ed.empId("101"));
		
		
		
	}

}
