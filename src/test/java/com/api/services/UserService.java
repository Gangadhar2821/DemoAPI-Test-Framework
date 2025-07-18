package com.api.services;

import com.api.base.BaseService;
import com.api.models.request.CreateUserRequest;
import com.api.models.request.UpdateUserRequest;

import io.restassured.response.Response;

public class UserService extends BaseService {
	public static CreateUserRequest createdUser;

	private static final String POST_BASE_PATH = "/user";
	private static final String BASE_PATH = "/user/";

	public Response createUser(CreateUserRequest payLoad) {
		createdUser = payLoad;
		return postRequest(payLoad, POST_BASE_PATH);
	}

	public Response getUser(String userName) {
		return getRequest(BASE_PATH + userName);
	}

	public Response updateUser(UpdateUserRequest payLoad, String username) {
		return putRequest(payLoad, BASE_PATH + username);
	}

	public Response deleteUser(String username) {
		return deleteRequest(BASE_PATH + username);

	}
}
