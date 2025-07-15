package com.api.services;

import com.api.base.BaseService;
import com.api.models.request.UpdateUserRequest;
import com.api.models.request.UserRequest;

import io.restassured.response.Response;

public class UserService extends BaseService {
	public static UserRequest sharedUser;

	private static final String BASE_PATH = "/user";

	public Response createUser(UserRequest payLoad) {
		sharedUser = payLoad;
		return postRequest(payLoad, BASE_PATH);
	}

	public Response getUser(String userName) {
		return getRequest(BASE_PATH + userName);
	}

	public Response updateUser(UpdateUserRequest payLoad) {
		return putRequest(payLoad, BASE_PATH);
	}
}
