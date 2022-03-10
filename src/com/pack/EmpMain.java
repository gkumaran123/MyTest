package com.pack;

import java.util.*;

public class EmpMain {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Kumar",2));
		empList.add(new Employee("Raja",3));
		empList.add(new Employee("Arjun",1));
		
		empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		empList.forEach(System.out::println);
		empList.forEach(e->{System.out.println(e);});
		
	}

}
