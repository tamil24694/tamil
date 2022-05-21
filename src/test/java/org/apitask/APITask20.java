package org.apitask;

import org.baseclass.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITask20 extends BaseClass{
	static RequestSpecification reqspec;

	public static void main(String[] args) {
		reqspec = RestAssured.given();
		reqspec = reqspec.pathParam("users", "2");
		reqspec = reqspec.log().all().body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}");
		Response post = reqspec.put("https://reqres.in/api/{users}");
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asPrettyString());

}


}
