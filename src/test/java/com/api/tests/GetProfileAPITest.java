package com.api.tests;

import org.testng.annotations.Test;

import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;
import com.api.models.request.LoginRequest;
import com.api.services.AuthenticationService;
import com.api.services.UserProfileManagementService;

import io.restassured.response.Response;

public class GetProfileAPITest {

	@Test(description = "Verify Getprofile API is working ")
	public void getProfile() {

		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.login(new LoginRequest("Gangadhar", "@Donna2128"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());

		UserProfileManagementService upms = new UserProfileManagementService();
		response = upms.getProfile(loginResponse.getToken());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getFirstName());

	}
}
