package org.greenscart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapppper {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		File scr = new File("C:\\Users\\user\\eclipse-workspace\\APIInterface\\src\\test\\resources\\Test\\ListJSONArray.json");
		OBJMAP v = mapper.readValue(scr, OBJMAP.class);
		System.out.println(v.getPage());
		System.out.println(v.getPer_page());
		System.out.println(v.getTotal());
		System.out.println(v.getTotal_pages());
		ArrayList<DataForOBJMAP> data = v.getData();
		for (DataForOBJMAP a : data) {
			System.out.println(a.getId());
			System.out.println(a.getEmail());
			System.out.println(a.getFirst_name());
			System.out.println(a.getLast_name());
			System.out.println(a.getAvatar());
		}
		System.out.println(v.getSupport().getUrl());
		System.out.println(v.getSupport().getText());
	}

}
