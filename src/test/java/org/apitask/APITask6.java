package org.apitask;

import org.baseclass.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APITask6 extends BaseClass {
	public static void main(String[] args) {
		apiGet("content-type", "application/json", "https://reqres.in/api/users?delay=3");
	}

}
