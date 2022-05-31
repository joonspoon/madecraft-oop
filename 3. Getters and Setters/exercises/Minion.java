package exercises;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	public Minion(String name,int eyes,String color,String master) {
		this.name= name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	public int getEyes() {
		return this.eyes;
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}
	public String getColor() {
		return color;
	}
}
