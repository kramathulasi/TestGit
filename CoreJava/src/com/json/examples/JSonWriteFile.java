package com.json.examples;
 import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JSonWriteFile {

	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "thulasi");
		Map<String, String> map = new HashMap<String,String>();
		map.put("Address", "Bellandur");
		map.put("State", "Karnataka");
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("Address1", "Bellandur");
		map2.put("State1", "Karnataka");
		JSONArray array = new JSONArray();
		array.add(map);
		array.add(map2);
		jsonObj.put("Array",array);
		System.out.println(jsonObj.toString());
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("D:\\Thulasi\\JSONSampleData.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.write(jsonObj.toJSONString());
		pw.flush();
		pw.close();
	}
}
