package org.greenscart;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GreensCart {
	public static void main(String[] args) throws IOException, ParseException {
		// 1.mention the file path
		FileReader reader = new FileReader(
				"C:\\Users\\user\\eclipse-workspace\\APIInterface\\src\\test\\resources\\Test\\tamil.json");
		// 2.Creat json parser
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(reader);
		JSONObject j = (JSONObject) obj;
		Object FirstName = j.get("FirstName");
		System.out.println(FirstName);
		System.out.println(j.get("LastName"));
		System.out.println(j.get("Email"));
		System.out.println(j.get("PhoneNo"));
		System.out.println(j.get("Password"));
		System.out.println(j.get("ConfirmPassword"));
		System.out.println("DateOfBirth is ");
		Object objDOB = j.get("DateOfBirth");
		JSONObject j1 = (JSONObject) objDOB;
		System.out.print(j1.get("Day"));
		System.out.print(j1.get("Month"));
		System.out.println(j1.get("Year"));
		System.out.println(j.get("Gender"));
	}
}
