package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.services.UserService;


public class GetUserAPITest {

	@Test(description = "To Verify GetUser API is working ..!")
	public void getUser() {
		UserService userService = new UserService();
		userService.getUser(userService.sharedUser.getUsername());

	}
}
