package org.apitask;

import org.baseclass.BaseClass;

public class APITask19 extends BaseClass{
	public static void main(String[] args) {
apiPost("https://reqres.in/api/login", "{\r\n" + 
		"    \"email\": \"peter@klaven\"\r\n" + 
		"}");
	}

}



