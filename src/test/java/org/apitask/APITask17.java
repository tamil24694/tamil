package org.apitask;

import org.baseclass.BaseClass;

public class APITask17 extends BaseClass{
	public static void main(String[] args) {
		apiPost( "https://reqres.in/api/login","{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}");
	}

}



