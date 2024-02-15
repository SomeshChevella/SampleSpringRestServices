package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EmployeesTests {
	@Test
    public void testGetEmployeeList() {
        Employees employees = new Employees();
        List<Employee> employeeList = employees.getEmployeeList();

        assertNotNull(employeeList);
        assertEquals(0, employeeList.size());
    }

    @Test
    public void testSetEmployeeList() {
        Employees employees = new Employees();
        List<Employee> newEmployeeList = new ArrayList<>();
        newEmployeeList.add(new Employee("John", "Doe", "5001", "john.doe@example.com", "Developer"));

        employees.setEmployeeList(newEmployeeList);

        assertEquals(newEmployeeList, employees.getEmployeeList());
    }
}
