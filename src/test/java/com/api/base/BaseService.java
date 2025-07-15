package com.api.base;

import com.api.filters.LoggingFilter;
import com.api.utilities.ConfigUtil;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URL = ConfigUtil.get("BASE_URL");
	private RequestSpecification requestSpecification;

	static {
		RestAssured.filters(new LoggingFilter());// Will run once and be available for all tests
	}

	public BaseService() {
		requestSpecification = RestAssured.given().baseUri(BASE_URL);
	}

	protected Response postRequest(Object payLoad, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payLoad).post(endPoint);
	}

	protected Response getRequest(String endPoint) {
		return requestSpecification.get(endPoint);
	}

	protected RequestSpecification setAuth(String token) {
		return requestSpecification.header("Authorization", "Bearer " + token);
	}

	protected Response putRequest(Object payLoad, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payLoad).put(endPoint);
	}
	
}
