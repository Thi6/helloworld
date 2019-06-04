package com.bae.models;

import java.util.HashMap;
import java.util.Map;

public class MapManager {
	private Map<Integer, String> myMap = new HashMap<Integer, String>();

	
	public void addToMap(Integer key, String value) {
		myMap.put(key, value);
	}
	
	public String retrieveName(int key) {
		return myMap.get(key); 
	}
	
	public Map<Integer, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}	
	 
}
