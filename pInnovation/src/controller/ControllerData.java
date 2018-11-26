package controller;

public class ControllerData {
	
	private ControllerDB ctrlDB;
	private ControllerLink ctrlLink;

	
	public ControllerData () {
		ctrlDB = new ControllerDB();
		ctrlLink = new ControllerLink(20,80);
	}
	
	public int controlData() {
		
		
		return 0;
	}
}
