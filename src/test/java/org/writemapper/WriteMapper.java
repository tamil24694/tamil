package org.writemapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteMapper {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Datum> data = new ArrayList<Datum>();
		Datum d1 = new Datum(7, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Datum d2 = new Datum(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson",
				"https://reqres.in/img/faces/8-image.jpg");
		Datum d3 = new Datum(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
		Datum d4 = new Datum(10, "byron.fields@reqres.in", "Byron", "Fields",
				"https://reqres.in/img/faces/10-image.jpg");
		Datum d5 = new Datum(11, "george.edwards@reqres.in", "George", "Edwards",
				"https://reqres.in/img/faces/11-image.jpg");
		Datum d6 = new Datum(12, "rachel.howell@reqres.in", "Rachel", "Howell",
				"https://reqres.in/img/faces/12-image.jpg");
		data.add(d1);
		data.add(d2);
		data.add(d3);
		data.add(d4);
		data.add(d5);
		data.add(d6);
		Support support = new Support("https://reqres.in/#support-heading",
				"To keep ReqRes free, contributions towards server costs are appreciated!");
		Root root = new Root(2, 6, 12, 2, (ArrayList<Datum>) data, support);
		File file = new File(
				"C:\\Users\\user\\eclipse-workspace\\APIInterface\\src\\test\\resources\\Test\\NewListOnArray.json");
		mapper.writeValue(file, root);
		System.out.println("File created");
	}

}
