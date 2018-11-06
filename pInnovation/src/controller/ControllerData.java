package controller;

public class ControllerData {
	
	private ControllerDB ctrlDB;
	private ControllerLink ctrlLink;

	
	public ControllerData () {
		ctrlDB = new ControllerDB();
		ctrlLink = new ControllerLink();
	}
}
