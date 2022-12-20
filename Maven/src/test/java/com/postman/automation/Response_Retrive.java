package com.postman.automation;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Response_Retrive {

	@Test
	public void response_Body() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification request = RestAssured.given();

		Response response = request.get("/api/unknown");

		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusLine());

		int statusCode = response.getStatusCode();

		Assert.assertEquals(200, statusCode);
		
		System.out.println("Validated");

	}

}
