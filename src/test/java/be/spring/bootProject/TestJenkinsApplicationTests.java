package be.spring.bootProject;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestJenkinsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
		assertEquals("coucou", "coucou");
	}

}
