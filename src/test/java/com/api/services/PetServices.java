package com.api.services;

import com.api.base.BaseService;
import com.api.models.request.CreatePetRequest;

import io.restassured.response.Response;

public class PetServices extends BaseService {
	public static CreatePetRequest createdPet;

	private static final String POST_BASE_PATH = "/pet";
	private static final String BASE_PATH = "/pet/";

	public Response createPet(CreatePetRequest payLoad) {
		createdPet = payLoad;
		return postRequest(payLoad, POST_BASE_PATH);
	}

}
