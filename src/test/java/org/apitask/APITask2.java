package org.apitask;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APITask2 {
	static RequestSpecification given;
	public static void main(String[] args) {
		given = RestAssured.given();
		RequestSpecification header = given.header("content-type","application/json");
		Response response = header.get("https://reqres.in/api/users/23");
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

}
