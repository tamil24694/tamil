package org.apitask;

import org.baseclass.BaseClass;

public class APITask11 extends BaseClass{
	public static void main(String[] args) {
		apiGet("content-type", "application/json", "https://petstore.swagger.io/v2/user/user1\r\n" + 
				"");
	}

}



