package com.example.restservice;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnOkWhenGettingEmployees() throws Exception {
		mockMvc.perform(get("/employees")).andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void shouldReturnOkWhenPostingEmployee() throws Exception{
        //Employee newEmployee = new Employee("Test", "User", "1001", "test.user@example.com", "Tester");
		mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON)
                .content("{\"first_name\":\"Test\",\"last_name\":\"User\","
                		+ "\"employee_id\":\"1001\",\"email\":\"test.user@example.com\",\"title\":\"Tester\"}"))
				.andExpect(status().isCreated());
	}
	
	@Test
	public void shouldReturnisNotFoundWhenGettingEmployeesUsingInvalidUri() throws Exception{
		mockMvc.perform(get("/xyz")).andExpect(status().isNotFound());
	}
	
}
