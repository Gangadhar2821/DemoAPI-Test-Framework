package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.model.response.UpdateUserResponse;
import com.api.models.request.UpdateUserRequest;
import com.api.services.UserService;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class UpdateUserAPITest {

	@Test(description = "Verify UpdateUser API is Working..!")
	public void updateUser() {
		UpdateUserRequest updateUserRequest = new UpdateUserRequest.Builder().id(3).username("HnewUsernew")
				.firstName("DDhi").lastName("naaa").email("gdsv12@gmail.com").password("pass!223").phone("887453915")
				.userStatus(2).build();

		UserService userService = new UserService();
		Response response = userService.updateUser(updateUserRequest, userService.createdUser.getUsername());
		System.out.println(response.asPrettyString());
		UpdateUserResponse updateUserResponse = response.as(UpdateUserResponse.class);
		Assert.assertEquals(updateUserResponse.getCode(), 200);

	}

}
