package examples;

public class Disease {
	
	//instance variables
	private String name;
	private boolean curable; 
	
	Disease(String title, boolean isCurable){
		this.curable = isCurable;
		this.name = title;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isCurable() {
		return curable;
	}
	
	
	void setName(String name) {
		this.name = name;
	}
	
}
