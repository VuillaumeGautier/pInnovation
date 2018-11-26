package model;

public class DeviceProto extends Device{
	private int temperatureMin;
	private int temperatureMax;
	

	public DeviceProto(int iddevice, int idbdd, int temperatureMin, int temperatureMax) {	
		super(iddevice, idbdd);
		this.temperatureMax = temperatureMax;
		this.temperatureMin = temperatureMin;
	}

	public void check(String values) {
		

        String v[] = values.split(";");
    	int temperature = Integer.parseInt(v[0]);
    	int led = Integer.parseInt(v[1]);
    	System.out.println(led);
		
		if(temperature > this.temperatureMax ) {
			System.out.println(temperature + " : too much");
		}
		else if(temperature < this.temperatureMin ) {
			System.out.println(temperature + " : not enough");
		}
		else {
			System.out.println(temperature + " : good");
		}
			
		if(led==1) {
			System.out.println(" Led ON");
		}
		else{
			System.out.println(" Led OFF");
		}
			
		
	}

}
