package com.api.services;

import com.api.base.BaseService;
import com.api.models.request.UserProfileRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {

	private static final String BASE_PATH = "/api/users/";

	public Response getProfile(String token) {
		setAuth(token);
		return getRequest(BASE_PATH + "profile");

	}

	public Response updateProfile(String token, UserProfileRequest payload) {
		setAuth(token);
		return putRequest(payload, BASE_PATH + "profile");

	}
 
}
