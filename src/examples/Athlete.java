package examples;

public class Athlete {

	private String name;
	private int speed;
	private static String location;
	private int bibNumber;
	private static int numberOfRunners;

	public Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		this.bibNumber = numberOfRunners++;
	}
	
	@Override
	public String toString() {
		return name + " " + speed + " at " + location + ", bib number " + this.bibNumber;
	}

	public void setLocation(String string) {
		this.location = string;
	}
	
	public static int getNumberOfRunners() {
		return numberOfRunners;
	}

}
