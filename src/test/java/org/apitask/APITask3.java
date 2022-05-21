package org.apitask;

import org.baseclass.BaseClass;

public class APITask3 extends BaseClass {
	public static void main(String[] args) {
		apiGet("content-type","application/json", "https://reqres.in/api/unknown");
	}

}
