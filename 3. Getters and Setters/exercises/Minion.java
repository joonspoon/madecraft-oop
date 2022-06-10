package exercises;

public class Minion {
	
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	// Creating constructor//
	
	Minion(String title, int eyes, String color, String master) {
		this.name = title;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	//Setters//
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMaster(String master) {
		this.master = master;
	}

	// Getters//
	
	public String getName() {
		return name;
	}

	public int getEyes() {
		return eyes;
	}

	public String getColor() {
		return color;
	}

	public String getMaster() {
		return master;
	}
	

	
}
