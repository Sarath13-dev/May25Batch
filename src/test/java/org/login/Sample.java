package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\APIAprilMay25\\src\\test\\resources\\Sample.json");
		FileReader fileReader = new FileReader(f);
		//ObjectMapper - Pre defined class - It compares the jsonObject 
		//with POJO object
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader, Root.class);
		System.out.println(readValue.getName());
		System.out.println(readValue.getAge());
		System.out.println(readValue.isStatus());
		
		Address address = readValue.getAddress();
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getCountry());
		
		ArrayList<String> courses = readValue.getCourses();
		for(int i=0; i<courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		System.out.println("Developers Work");
		System.out.println("Developer New Feature");
		System.out.println("QA Work");
		System.out.println("Tester");

		

	}

}
