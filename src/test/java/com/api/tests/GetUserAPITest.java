package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.model.response.GetUserResponse;
import com.api.services.UserService;

import io.restassured.response.Response;

public class GetUserAPITest {

	@Test(description = "To Verify GetUser API is working ..!")
	public void getUser() {
		UserService userService = new UserService();
		Response response = userService.getUser(userService.createdUser.getUsername());
		GetUserResponse getUserResponse = response.as(GetUserResponse.class);// DeSerialization
		Assert.assertEquals(getUserResponse.getUsername(), "Ganganna");

	}
}
