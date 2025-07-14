package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.model.response.LoginResponse;
import com.api.models.request.LoginRequest;
import com.api.services.AuthenticationService;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {

	@Test(description = "Verify if Login-API is working ")
	public void loginTest() {

		AuthenticationService authenticationService = new AuthenticationService();
		LoginRequest loginRequest = new LoginRequest("Gangadhar", "@Donna2128");
		Response response = authenticationService.login(loginRequest);
		LoginResponse loginresponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginresponse.getToken());
		System.out.println(loginresponse.getEmail());
		System.out.println(loginresponse.getId());
		Assert.assertTrue(loginresponse.getToken() != null);
		Assert.assertEquals(loginresponse.getEmail(), "vijay123@gmail.com");
		Assert.assertEquals(loginresponse.getId(), 2010);
	}
}
