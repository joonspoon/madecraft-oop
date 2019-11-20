package examples;

public class Athlete {

	private String name;
	private int speed;
	private static String marathonLocation;
	private int bibNumber;
	private static int runnersInRace;

	public Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		runnersInRace++;
		this.bibNumber = runnersInRace;
	}

	public void setMarathonLocation(String marathonLocation) {
		this.marathonLocation = marathonLocation;
	}

	@Override
	public String toString() {
		return "Athlete " + name + " is running at " + speed + " miles per hour at " + marathonLocation + " " + bibNumber;
	}

	public static int getRunnersInRace() {
		return runnersInRace;
	}
	
	
}
