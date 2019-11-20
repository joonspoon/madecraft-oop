package examples;

public class Disease {

	private String name;
	private boolean curable;
	
	Disease(String title, boolean isCurable) {
		this.curable = isCurable;
		this.name = title;
	}

	/* SETTERS */

	public void setName(String name) {
		this.name = name;
	}

	public void setCurable(boolean curable) {
		this.curable = curable;
	}
	
	/* GETTERS */
	
	public boolean isCurable() {
		return curable;
	}
	
	public String getName() {
		return name;
	}
	
}
