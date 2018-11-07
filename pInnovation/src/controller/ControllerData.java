package controller;

import model.DisplayData;

public class ControllerData {
	
	private ControllerDB ctrlDB;
	private ControllerLink ctrlLink;
	private DisplayData viewData;
	
	public ControllerData () {
		ctrlDB = new ControllerDB();
		ctrlLink = new ControllerLink();
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
}
