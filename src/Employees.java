import java.util.Scanner;
public class Employees {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		 int empId=sc.nextInt();
		 System.out.println("enter empName");
        String empName=sc.next();
        System.out.println("enter email");
        String empEmail=sc.next();
        System.out.println("enter phoneno");
         long empPhoneno=sc.nextLong();
         System.out.println("enter salary");
         double empSalary=sc.nextDouble();
         System.out.println("enter the gender");
         char empGender=sc.next().charAt(0);
       System.out.println("enter city");
         String empCity=sc.next();
        System.out.println(empId+"\n"+empName+"\n"+empEmail+"\n"+empPhoneno+"\n"+empGender+
        		  "\n"+empSalary+"\n"+empCity);
	}

}
