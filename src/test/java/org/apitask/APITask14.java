package org.apitask;

import org.baseclass.BaseClass;

public class APITask14 extends BaseClass{
	public static void main(String[] args) {
		apiPost("https://reqres.in/api/users", "{\r\n" + 
				"    \"name\": \"tamil\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}");
	}

}



