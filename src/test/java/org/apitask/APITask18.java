package org.apitask;

import org.baseclass.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITask18 extends BaseClass{
	static RequestSpecification reqspec;
	public static void main(String[] args) {
		
		reqspec = RestAssured.given();
		reqspec.header("content-type","application/json");
		reqspec = reqspec.log().all().body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}");
		Response post = reqspec.post("https://reqres.in/api/login");
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asPrettyString());
	}

}



