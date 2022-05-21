package org.apitask;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APITask {
	static RequestSpecification assured;
	public static void main(String[] args) {
		assured=RestAssured.given();
		assured=assured.header("Accept-Language","application/json");
		Response response = assured.get("https://reqres.in/api/users?page=2");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
		System.out.println(asPrettyString);
		System.out.println(asPrettyString);
		
		
		
	}
}
