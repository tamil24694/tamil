package org.greenscart;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleUser {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\user\\eclipse-workspace\\APIInterface\\src\\test\\resources\\Test\\TestSingleUser.json");
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject j = (JSONObject) parse;
		Object data1 = j.get("data");
		JSONObject j1 = (JSONObject) data1;
		System.out.println(j1.get("id"));
		System.out.println(j1.get("email"));
		System.out.println(j1.get("first_name"));
		System.out.println(j1.get("last_name"));
		System.out.println(j1.get("avatar"));
		Object data2 = j.get("support");
		JSONObject j2 = (JSONObject) data2;
		System.out.println(j2.get("url"));
		System.out.println(j2.get("text"));

	}
}
