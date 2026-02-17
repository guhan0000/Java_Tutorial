package com.java8.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo3 {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer> collect = list.stream()
		.filter(n->n%2==0)
		.map(n->n*n*n)
		.collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("********************************");
		List<Employee> empList=Arrays.asList(
				new Employee(101, "Guhan", "IT", 20000),
				new Employee(102, "Naresh", "HR", 22000),
				new Employee(103, "Morgan", "Finance", 30000),
				new Employee(104, "John", "IT", 50000),
				new Employee(105, "Bala", "HR", 30000)	
				);
		for(Employee employee:empList) {
			System.out.println(employee.getEmpName());
		}
		System.out.println("***************************************");
//		group by emp dept
		Map<String, List<Employee>> empByDept = empList.stream()
			.collect(Collectors.groupingBy(Employee::getEmpDept));
		
		for(Map.Entry<String, List<Employee>> entry:empByDept.entrySet()) {
			System.out.println(entry.getKey());
			List<Employee> value = entry.getValue();
			for(Employee employee:value) {
				System.out.println(employee.getEmpName());
			}
		}
		
	}

}
