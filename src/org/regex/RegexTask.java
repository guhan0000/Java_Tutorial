package org.regex;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTask {
	
	public static LocalDate testDate(String date) {
		if( Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",date)) {
			try {
				return LocalDate.of(Integer.parseInt(date.substring(0,4)),Integer.parseInt(date.substring(5,7)),Integer.parseInt(date.substring(8)));
			}catch(Exception e) {
				System.out.println("Invalid Date");
			}
		}
		else {
			System.out.println("invalid date");
		}
		return null;
	}
	public static String testEmpName(String name)  {
		 
			 if(!Pattern.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+$",name)) {
					System.out.println("Invalid Name");
					name=null;
				 }
			
		 return name;
		 
	}
	public static String testEmpDept(String dept) {
		if(!Pattern.matches("^(HR|IT|SALES)$",dept)) {
			System.out.println("Invalid Dept");
			dept=null;
		}
		return dept;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date of joining (yyyy-mm-dd)");
		String date=scanner.nextLine();
//		System.out.println(testDate(date));
		System.out.println("enter emp name");
		String name=scanner.nextLine();
//		System.out.println(testEmpName(name));
		System.out.println("entet department");
		String dept=scanner.nextLine();
		Employee employee=new Employee(testEmpName(name),testEmpDept(dept),testDate(date),0);
		System.out.println(employee.getEmpDept());
		
		
//		LocalDate of = LocalDate.of(Integer.parseInt(date.substring(0,4)),Integer.parseInt(date.substring(5,7)),Integer.parseInt(date.substring(8)));
		}
	

}
