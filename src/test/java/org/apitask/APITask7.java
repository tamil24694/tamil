package org.apitask;

import org.baseclass.BaseClass;

public class APITask7 extends BaseClass{
	public static void main(String[] args) {
		apiGet("content-type", "application/json", "https://petstore.swagger.io/v2/pet/findByStatus?status=pending");
	}

}



