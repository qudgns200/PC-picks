package io.github.qudgns200;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PortfolioApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	void contextLoads() {
		try {
			mockMvc.perform(get("/get")
					.contentType(MediaType.APPLICATION_JSON_VALUE)
					.param("name", "Lee")
					.param("age", "31"))
					.andExpect(status().isOk())
					.andDo(print());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
