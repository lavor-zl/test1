package com.lavor.jenkins.war;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.mock;

/**
 * SpringBoot的改进，只用@RunWith(SpringRunner.class)，@SpringBootTest两个注解就可以测试
 * 并且在web环境下测试，不用像以前使用下面三个注解
 * @RunWith(SpringJUnit4ClassRunner.class)
   @SpringApplicationConfiguration(classes = Application.class)
   @WebAppConfiguration
   有一个注解@WebMvcTest比@SpringBootTest在测试上发挥在功能还要强大，但是它们两者不可以一起使用
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	MockMvc mvc;

	@Autowired
	WebApplicationContext webApplicationConnect;

	@Before
	public void setUp() throws JsonProcessingException {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
	}

		@Test
	public void contextLoads() {
			try {
				MvcResult mvcResult=mvc.perform(MockMvcRequestBuilders.get("/say").accept(MediaType.APPLICATION_JSON)).andReturn();
				int status = mvcResult.getResponse().getStatus();
				System.out.println(status);
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
