package com.assignment4;
import java.util.ArrayList;
import java.util.Collections;

import com.assignment4.Employee.Sorting;
public class Main {
	public static void main(String args[]) {
	ArrayList<Employee>Employees=new ArrayList<Employee>();
	Employees.add(new Employee(11,"Jim","Madhya Pradesh",22000));
	Employees.add(new Employee(12,"Shina","Maharashtra",44000));
	Employees.add(new Employee(13,"Rhea","Karnataka",66000));
	Employees.add(new Employee(14,"Sanil","Andhra Pradesh",88000));
	Employees.forEach(Employee7->System.out.println("Id:"+Employee7.getId()+"\t"+"Name:"+Employee7.getName()+"\t"+"Address:"+Employee7.getAddress()+"\t"+"Salary:"+Employee7.getSal()+"\n"));
    Collections.sort(Employees,Sorting::compareBySal);
    Employees.forEach(emp->System.out.println("Id:"+emp.getId()+"\t"+"Name:"+emp.getName()+"\t"+"Address:"+emp.getAddress()+"\t"+"Salary:"+emp.getSal()+"\n"));
	}

}


