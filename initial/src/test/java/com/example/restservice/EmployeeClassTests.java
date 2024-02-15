package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeClassTests {
	@Test
    public void testGettersAndSetters() {
        Employee employee = new Employee();
        employee.setFirst_name("John");
        employee.setLast_name("Doe");
        employee.setEmployee_id("5001");
        employee.setEmail("john.doe@example.com");
        employee.setTitle("Developer");

        assertEquals("John", employee.getFirst_name());
        assertEquals("Doe", employee.getLast_name());
        assertEquals("5001", employee.getEmployee_id());
        assertEquals("john.doe@example.com", employee.getEmail());
        assertEquals("Developer", employee.getTitle());
    }

    @Test
    public void testConstructor() {
        Employee employee = new Employee("John", "Doe", "5001", "john.doe@example.com", "Developer");

        assertEquals("John", employee.getFirst_name());
        assertEquals("Doe", employee.getLast_name());
        assertEquals("5001", employee.getEmployee_id());
        assertEquals("john.doe@example.com", employee.getEmail());
        assertEquals("Developer", employee.getTitle());
    }
}
