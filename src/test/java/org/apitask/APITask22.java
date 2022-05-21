package org.apitask;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITask22 {
	static RequestSpecification reqspec;

	public static void main(String[] args) {
		reqspec = RestAssured.given();
		reqspec = reqspec.header("content-type","application/json");
		reqspec = reqspec.log().all().body("{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"username\": \"string\",\r\n" + 
				"  \"firstName\": \"string\",\r\n" + 
				"  \"lastName\": \"string\",\r\n" + 
				"  \"email\": \"string\",\r\n" + 
				"  \"password\": \"string\",\r\n" + 
				"  \"phone\": \"string\",\r\n" + 
				"  \"userStatus\": 0\r\n" + 
				"}");
		 Response put = reqspec.put("https://petstore.swagger.io/v2/user/user1\r\n" + 
		 		"");
		System.out.println(put.getStatusCode());
		System.out.println(put.getBody().asPrettyString());

}
}



