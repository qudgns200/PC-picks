package io.github.qudgns200;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.qudgns200.model.User;
import io.github.qudgns200.service.UserService;

@SpringBootTest
class PortfolioApplicationTests {

	@Autowired
	private UserService uService;
	
	@Test
	void userTest() {
		User user = new User();
		user = uService.getUesrInfo("1");
	}
}
