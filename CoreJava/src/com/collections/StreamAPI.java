package com.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, User> userMap = new HashMap<>();
		userMap.put(1, new User(1, "Google"));
		userMap.put(2, new User(2, "Frugalis"));
		userMap.put(3, new User(3, "Minds"));
		userMap.forEach((K,V)->System.out.println(V.toString()));
 
		List<Integer> output_3 = userMap.keySet().stream()
			.collect(Collectors.toList());
		System.out.println(output_3.toString());
		List<User> output_4 = userMap.values().stream()
			.collect(Collectors.toList());
		System.out.println(output_4.toString());
	}
}
class User{
	int id;
	String name;
	
 
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
 
	//
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
