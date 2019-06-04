package com.bae.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.models.MapManager;

public class HellowordTest {
	
	static MapManager myManager;
	
	@BeforeClass
	public static void init() {
		myManager = new MapManager();
		myManager.addToMap(1, "Thi");
		myManager.addToMap(2, "Aysha");
		myManager.addToMap(3, "Karishma");
		myManager.addToMap(4, "Harry");
		
	} 
	
	@Test
	public void checkItemTest() {
		assertTrue(myManager.getMyMap().containsValue("Thi"));
	} 
	
	@Test
	public void checkForItemTest() {
		assertFalse(myManager.getMyMap().containsValue("hello"));
	}
	
	@Test
	public void retrieveNameTest() {
		assertEquals("Aysha", myManager.retrieveName(2));
	} 
	
	


	
	
	
	
}
