package controller;

public class Controller {

	private ControllerData ctrlData;
	private ControllerView ctrlView;
	
	
	public Controller() {
		ctrlData = new ControllerData();
		ctrlView = new ControllerView();
	}
	
	public int control() {
		
		ctrlData.controlData();
		
		return 0;
	}
	
}
