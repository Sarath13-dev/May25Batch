package org.logout;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\APIAprilMay25\\src\\test\\resources\\Write.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Batter batter1 = new Batter("1001", "Regular");
		Batter batter2 = new Batter("1002", "Chocalate");
		Batter batter3 = new Batter("1003", "Blueberry");
		Batter batter4 = new Batter("1004", "Devil's Food");
		ArrayList<Batter> batter = new ArrayList();
		batter.add(batter1);
		batter.add(batter2);
		batter.add(batter3);
		batter.add(batter4);
		Batters batters = new Batters(batter);
		Topping topping1 = new Topping("5001", "None");
		Topping topping2 = new Topping("5002", "Glazed");
		Topping topping3 = new Topping("5003", "Sugar");
		ArrayList<Topping> topping = new ArrayList();
		topping.add(topping1);
		topping.add(topping2);
		topping.add(topping3);
		Root root = new Root("0001", "donout", "Cake",
				0.55, batters, topping);
		objectMapper.writeValue(file, root);
	}

}
