package examples;

public class Taco {
	
	String filling;
	String tortilla;

	public void setFilling(String filling) {
		this.filling = filling;
	}

	private String getFilling() {
		return this.filling;
	}

	public static void main(String[] args) {
		
		Taco taco = new Taco();
		taco.setFilling("carne asada");
		System.out.println(taco.getFilling());
		
	}

}
