package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

	private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec);// This is where the request is going to be Executed.
		logResponse(response);
		return response;// this will be used in the tests for Assertions
	}

	public void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI : " + requestSpec.getBaseUri());
		logger.info("Request Headers : " + requestSpec.getHeaders());
		logger.info("Request PayLoad : " + requestSpec.getBody());
	}

	public void logResponse(Response response) {
		logger.info("STATUS CODE:" + response.getStatusCode());
		logger.info("Response Header:" + response.headers());
		logger.info("Response Body:" + response.getBody().asPrettyString());

	}

}
