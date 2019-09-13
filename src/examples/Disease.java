package examples;

public class Disease {

	private String name;
	private boolean curable;
	
	Disease(String title, boolean isCurable) {
		this.curable = isCurable;
		this.name = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCurable() {
		return curable;
	}

	public void setCurable(boolean curable) {
		this.curable = curable;
	}
	
	
	
}
