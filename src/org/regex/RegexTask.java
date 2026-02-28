package org.regex;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTask {
	
	public static LocalDate testDate(String date) {
		if( !Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",date)) {
			throw new IllegalArgumentException("Invalid Date");		  
			
		}
		try {
			return LocalDate.of(Integer.parseInt(date.substring(0,4)),Integer.parseInt(date.substring(5,7)),Integer.parseInt(date.substring(8)));
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid Date value");
		}
	}
	
	public static String testEmpName(String name)  {
		 
			 if(!Pattern.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+$",name)) {
					throw new IllegalArgumentException("Invalid Name");
				 }
			
		 return name;
		 
	}
	public static String testEmpDept(String dept) {
		if(!Pattern.matches("^(HR|IT|SALES)$",dept)) {
			throw new IllegalArgumentException("Invalid Dept");
		}
		return dept;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			
			
			System.out.println("Enter date of joining (yyyy-mm-dd)");
			LocalDate date=testDate(scanner.nextLine());
//			System.out.println();
			System.out.println("enter emp name");
			String name=testEmpName(scanner.nextLine());
//			System.out.println(testEmpName(name));
			System.out.println("entet department");
			String dept=testEmpDept(scanner.nextLine());
			Employee employee=new Employee(name,dept,null,0);
			System.out.println(employee.getEmpDept());
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
//		LocalDate of = LocalDate.of(Integer.parseInt(date.substring(0,4)),Integer.parseInt(date.substring(5,7)),Integer.parseInt(date.substring(8)));
		}
	

}
