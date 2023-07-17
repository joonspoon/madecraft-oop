package examples;

public class DiseasePractice {
	
	private String name;
	private boolean curable;
	
	public DiseasePractice(String name, boolean curable) {
		super();
		this.name = name;
		this.curable = curable;
	}
	
	public DiseasePractice() {
		super();
	}

	// Getter and Setter
	public boolean isCurable() {
		return this.curable;
	}
	
	public void setCurable(boolean curable) {
		this.curable = curable;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
