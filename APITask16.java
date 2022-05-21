package org.apitask;

import org.baseclass.BaseClass;

public class APITask16 extends BaseClass{
	public static void main(String[] args) {
		apiPost("https://reqres.in/api/register", "{\r\n" + 
				"    \"email\": \"sydney@fife\"\r\n" + 
				"}");
	}

}



