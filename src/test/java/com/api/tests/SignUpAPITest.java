package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.SignUpRequest;
import com.api.services.AuthenticationService;

import io.restassured.response.Response;

public class SignUpAPITest {
	@Test(description = "Verify if Signup API is working")
	public void signUp() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder().username("mahdgg7dty126234").email("miistrrygfhna@yahoo.com")
				.firstName("Ganga").lastName("b").password("Gangad@1234").mobileNumber("9506573915").build();

		AuthenticationService service = new AuthenticationService();
		Response response = service.signUp(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}

}
