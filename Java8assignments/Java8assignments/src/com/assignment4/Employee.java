package com.assignment4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {

	private int Id=0;
	private String name=null;
	private String address =null;
	private int sal=0;
	public Employee(int Id,String name,String address,int sal) {
		this.Id=Id;
		this.name=name;
		this.address=address;
		this.sal=sal;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getId() {
		return Id;
	}
static class Sorting implements Comparator<Employee>{
	public static int compareBySal(Employee e1,Employee e2) {
		return e1.getSal()>e2.getSal()?1:e1.getSal()<e2.getSal()?-1:0;
		
	}
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.getSal()>e2.getSal()?1:e1.getSal()<e2.getSal()?-1:0;
	}
}
}

