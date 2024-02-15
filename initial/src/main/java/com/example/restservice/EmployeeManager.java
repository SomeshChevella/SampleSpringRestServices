package com.example.restservice;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
	private static Employees employeeList = new Employees();
	
	static {
		employeeList.getEmployeeList().add(
				new Employee("Somesh","Chevella","3001","somesh@gmail.com","Software Engineer"));
		employeeList.getEmployeeList().add(
				new Employee("Peter","Heins","3002","peterheins@gmail.com","Operations Specialist"));
		employeeList.getEmployeeList().add(
				new Employee("Sara","Williams","3003","sara@gmail.com","Operations Opecialist"));
		employeeList.getEmployeeList().add(
				new Employee("John","Smith","3004","johnsmith@gmail.com","Data analyst"));
	
	}
	
	public Employees getAllEmployees() {
		return employeeList;
	}	
	
	public void addEmployee(Employee employee) {
		employeeList.getEmployeeList().add(employee);	
	}
}