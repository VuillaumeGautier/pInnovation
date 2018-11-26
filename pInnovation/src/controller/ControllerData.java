package controller;

import model.DisplayData;

public class ControllerData {
	
	private ControllerDB ctrlDB;
	private ControllerLink ctrlLink;
	private DisplayData viewData;
	private String config;
	
	public ControllerData () {
		ctrlDB = new ControllerDB();
		ctrlLink = new ControllerLink(20,80);
	}
	
	public int controlData() {
		
		checkEquipement();
		checkDB();
		
		return 0;
	}
	
	private void checkEquipement() {
		
	}
	
	private void checkDB() {
		
	}
	
	private void sendToDisplay(String dataName, String value) {
		
	}
	
	private String getFromDisplay(String dataName) {
		
		return "0";
	}
	
	private String takeConfig() {
		
		
		return config;
	}
	
	private void writeConfig() {
		//
	}
}
