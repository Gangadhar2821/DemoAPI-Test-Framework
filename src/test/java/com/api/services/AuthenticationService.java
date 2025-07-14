package com.api.services;

import java.util.HashMap;

import com.api.base.BaseService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response login(LoginRequest payLoad) {
		return postRequest(payLoad, BASE_PATH + "login");
	}

	public Response signUp(SignUpRequest payLoad) {
		return postRequest(payLoad, BASE_PATH + "signup");
	}

	public Response forgetPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH + "forgot-password");

	}

}
