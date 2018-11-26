package controller;

import model.ArduinoSerial;
import model.DeviceProto;

public class ControllerLink {
	DeviceProto device1;
	

	public ControllerLink(int temperatureMin, int temperatureMax) {
		this.device1 = new DeviceProto(1,1,temperatureMin,temperatureMax);
		
		
		
	}
	Thread t = new Thread();
	//@Override
	public void run(){
		
		ArduinoSerial arduino = new ArduinoSerial("COM3");
		arduino.initialize();
		while(true) {
			String values = arduino.read();
			//System.out.println(values);
			if(values != null) {
		    	this.device1.check(values);
		        //System.out.println(mots[0]);
			}
	 
	        
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
