package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.model.response.CreateUserResponse;
import com.api.models.request.CreateUserRequest;
import com.api.services.UserService;

import io.restassured.response.Response;

public class CreateUserAPITest {

	@Test(description = "To Verify Create User API is working")
	public void createUser() {
		CreateUserRequest userRequest = new CreateUserRequest.Builder().id(2).username("Ganganna")
				.firstname("Gangadhar").lastname("b").email("gang123@gmail.com").password("@Donn").phone("7506573915")
				.userstatus(1).build();

		UserService userService = new UserService();
		Response response = userService.createUser(userRequest);
		CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);// deSerialization
		Assert.assertEquals(createUserResponse.getCode(), 200);

	}
}
