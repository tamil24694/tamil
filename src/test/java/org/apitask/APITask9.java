package org.apitask;

import org.baseclass.BaseClass;

public class APITask9 extends BaseClass{
	public static void main(String[] args) {
		apiGet("content-type", "application/json", "https://petstore.swagger.io/v2/store/order/2\r\n" + 
				"");
	}

}



