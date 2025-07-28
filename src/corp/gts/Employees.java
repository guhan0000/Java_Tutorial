package corp.gts;

public class Employees extends Company {
	//int empid=1001;
	public void empId()
	{
		
		System.out.println("101");
	}
	public void empName()
	{
		System.out.println("Guhan");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1=new Employees();
		//System.out.println(e1.empid);
		e1.empId();
		e1.empName();
		e1.companyId();
		e1.companyName();
		System.out.println(e1.comp_city);
		
	}

}
