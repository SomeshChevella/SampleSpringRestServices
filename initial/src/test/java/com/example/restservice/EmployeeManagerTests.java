package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

public class EmployeeManagerTests {
	
	@Test
	public void  testGetAllEmployees() {
		EmployeeManager employeeManager = new EmployeeManager();
        Employees employees = employeeManager.getAllEmployees();
        assertNotNull(employees);
        assertNotNull(employees.getEmployeeList());
	}
	
	@Test
    public void testAddEmployee() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employeeToAdd = new Employee("Test", "User", "4001", "test@gmail.com", "Tester");
        employeeManager.addEmployee(employeeToAdd);

        Employees employees = employeeManager.getAllEmployees();
        assertNotNull(employees);

        List<Employee> employeeList = employees.getEmployeeList();
        assertNotNull(employeeList);

        boolean employeeAdded = employeeList.stream().anyMatch(e -> e.getEmployee_id().equals("4001"));
        assertEquals(true, employeeAdded);
    }
}
