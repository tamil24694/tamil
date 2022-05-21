package org.apitask;

import org.baseclass.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITask21 {
	static RequestSpecification reqspec;

	public static void main(String[] args) {
		reqspec = RestAssured.given();
		reqspec = reqspec.header("content-type","application/json");
		reqspec = reqspec.log().all().body("{\r\n" + 
				"  \"id\": 11,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 333,\r\n" + 
				"    \"name\": \"selvan\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"dogghgd\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 222,\r\n" + 
				"      \"name\": \"tamil\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"pending\"\r\n" + 
				"}");
		 Response put = reqspec.put("https://petstore.swagger.io/v2/pet\r\n");
		System.out.println(put.getStatusCode());
		System.out.println(put.getBody().asPrettyString());

}
}



