package mx.abrahamntd.poc.rest.restservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest {

	@Autowired
	private MockMvc mock;

	@Test
	public void noParamRestMessageShouldReturnDefaultMessage() throws Exception {
		mock.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello abrahamntd!"));
	}

	@Test
	public void paramRestMessageShouldReturnCustumMessage() throws Exception {
		mock.perform(get("/hello").param("name", "Abraham Ntd"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello Abraham Ntd!"));
	}

}
