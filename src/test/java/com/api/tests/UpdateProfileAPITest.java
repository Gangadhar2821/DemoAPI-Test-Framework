package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserProfileRequest;
import com.api.services.AuthenticationService;
import com.api.services.UserProfileManagementService;

import io.restassured.response.Response;

public class UpdateProfileAPITest {

	@Test(description = "Verify Update Prifile API is working")
	public void updateProfile() {
		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.login(new LoginRequest("Gangadhar", "@Donna2128"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		System.out.println("=================================================================");

		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "Gangadhar");
		System.out.println("=================================================================");

		UserProfileRequest payLoad = new UserProfileRequest.Builder().setFirstName("Hello").setLastName("Hai")
				.setemail("vijay123@gmail.com").setmobileNumber("8888888882").build();
		response = userProfileManagementService.updateProfile(loginResponse.getToken(), payLoad);
		System.out.println(response.asPrettyString());

	}
}
