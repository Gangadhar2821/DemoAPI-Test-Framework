package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.request.UserRequest;
import com.api.services.UserService;

import io.restassured.response.Response;


public class CreateUserAPITest {

	@Test(description = "To Verify Create User API is working")
	public void createUser() {
		UserRequest userRequest = new UserRequest.Builder().id(2).username("Ganganna").firstname("Gangadhar")
				.lastname("b").email("gang123@gmail.com").password("@Donn").phone("7506573915").userstatus(1).build();

		UserService userService = new UserService();
		Response user = userService.createUser(userRequest);
		
		System.out.println(user.asPrettyString());

	}
}
