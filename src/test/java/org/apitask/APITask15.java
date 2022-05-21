package org.apitask;

import org.baseclass.BaseClass;

public class APITask15 extends BaseClass{
	public static void main(String[] args) {
		apiPost("https://reqres.in/api/register", "{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"pistol\"\r\n" + 
				"}");
	}

}



