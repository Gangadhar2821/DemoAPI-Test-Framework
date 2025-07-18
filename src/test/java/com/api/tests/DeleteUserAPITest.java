package com.api.tests;

import org.testng.annotations.Test;

import com.api.services.UserService;

import io.restassured.response.Response;

public class DeleteUserAPITest {

	@Test(description = "Verify DeleteUser API is Working !")
	public void deleteUser() {

		UserService userService = new UserService();
		Response response = userService.deleteUser(userService.createdUser.getUsername());
		System.out.println(response.asPrettyString());
	}
}
