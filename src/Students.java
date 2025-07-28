import java.util.*;
public class Students {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float total=0,avg=0;
		System.out.println("enter id");
		int studentId=sc.nextInt();
		System.out.println("enter name");
		String studentName=sc.next();
		System.out.println("mark1");
        float Mark1=sc.nextFloat();
        System.out.println("enter mark2");
       	float Mark2=sc.nextFloat();
       	System.out.println("enter mark3");
        float Mark3=sc.nextFloat();
        System.out.println("enter mark4");
        float Mark4=sc.nextFloat();
        System.out.println("enter mark5");
        float Mark5=sc.nextFloat();
        total=Mark1+Mark2+Mark3+Mark4+Mark5;
        avg=total/5;
        System.out.println(studentId+"\n"+
                studentName+"\n"+
                Mark1+"\n"+
                Mark2+"\n"+
                Mark3+"\n"+
                Mark4+"\n"+
                Mark5+"\n"+total+"\n"+avg);
        
	}

}
