package examples;

public class AthletePractice {
	
	private String name;
	private int speed;
	private static String matathonLocation;
	private int bibNumber;
	private static int runnersInRace;
	
	public AthletePractice(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
		runnersInRace++;
		this.bibNumber = runnersInRace;
	}

	public void setMatathonLocation(String matathonLocation) {
		this.matathonLocation = matathonLocation;
	}	
	
	public static int getRunnersInRace() {
		return runnersInRace;
	}
	
	@Override
	public String toString() {
		return "Athlete " + name + " is running at " + speed + " miles per hour at " + marathonLocation + " " + bibNumber;
	}
}
