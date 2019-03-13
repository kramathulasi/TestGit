package com.json.examples;

import java.io.FileReader;
import java.util.Iterator;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSonReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Object obj = new JSONParser().parse(new FileReader("D:\\Thulasi\\JSONSampleData.json"));
			JSONObject jsonObj = (JSONObject)obj;
			String name = (String)jsonObj.get("name");
			JSONArray array = (JSONArray)jsonObj.get("Array");
			Iterator itr = array.iterator();
			while(itr.hasNext())
			{
				
			}
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
