package com.assignment1;

import java.util.ArrayList;

public class Main{
public static void main(String args[]) {
	ArrayList<Employee>Employees=new ArrayList<Employee>();
	Employees.add(new Employee(11,"Jim","Madhya Pradesh",22000));
	Employees.add(new Employee(12,"Shina","Maharashtra",44000));
	Employees.add(new Employee(13,"Rhea","Karnataka",66000));
	Employees.add(new Employee(14,"Sanil","Andhra Pradesh",88000));
	Employees.forEach(Employee->System.out.println("Id:"+Employee.getId()+"\t"+"Name:"+Employee.getName()+"\t"+"Address:"+Employee.getAddress()+"\t"+"Salary:"+Employee.getSal()+"\n"));
}

}


