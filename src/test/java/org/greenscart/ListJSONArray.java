package org.greenscart;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListJSONArray {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(
				"C:\\Users\\user\\eclipse-workspace\\APIInterface\\src\\test\\resources\\Test\\ListJSONArray.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject j = (JSONObject) parse;
		System.out.println(j.get("page"));
		System.out.println(j.get("per_page"));
		System.out.println(j.get("total"));
		System.out.println(j.get("total_pages"));
		Object object = j.get("data");
		JSONArray arr = (JSONArray) object;
		for (int i = 0; i < arr.size(); i++) {
			Object object2 = arr.get(i);
			JSONObject j1 = (JSONObject) object2;
			System.out.println(j1.get("id"));
			System.out.println(j1.get("email"));
			System.out.println(j1.get("first_name"));
			System.out.println(j1.get("last_name"));
			System.out.println(j1.get("avatar"));

		}
		Object object2 = j.get("support");
		JSONObject j2 = (JSONObject) object2;
		System.out.println(j2.get("url"));
		System.out.println(j2.get("text"));

	}
}
