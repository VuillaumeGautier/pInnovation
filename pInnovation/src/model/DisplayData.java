package model;

public class DisplayData {
	
	private String test;
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getSetTest(String test) {
		if(test == null) {
			return getTest();
		}else {
			setTest(test);
			return null;
		}
		
	}	
	
	public String setGetFor(String dataName, String newValue) {
		
		switch(dataName) {
			
			case "test" : return getSetTest(newValue);
		
		}
		
		
		return "error404";
	}

	

}
