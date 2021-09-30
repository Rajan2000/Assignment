package com.assessment;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
	private int empno;
	private String name;
	private int age;
	String location;
	public Employee(int empno, String name, int age, String location) {
		super();
		this.empno = empno;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}

public class EmployeeDetails{
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Rajan", 22, "Kasganj"));
		list.add(new Employee(2, "sid", 27, "chennai"));
		list.add(new Employee(3, "amit", 21, "noida "));
		list.add(new Employee(4, "samay", 34, "gudgaon"));
		list.add(new Employee(5, "rohit", 23, "ghaziabad"));
		
		// storing the value of employee in another list
		ArrayList<Employee> puneList = (ArrayList<Employee>) list.stream()
		.filter(f1->f1.getLocation().equals("noida ")) // filtering the location 
		.collect(Collectors.toList());
		System.out.println("Details are : ");
		puneList.forEach(data-> {
			System.out.println(" Empl No : "+ data.getEmpno() + ", Name : " + data.getName() +", Location : "+ data.getLocation() +", Age : "+ data.getAge());
			
		});
		
		
	}
	
}