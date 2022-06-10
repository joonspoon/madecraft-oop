package examples;

public class Marathon {
		
	public static void main(String[] args) {
		Athlete mike = new Athlete("Mike", 10);
		Athlete betsy = new Athlete("Betsy", 12);
		
		mike.setMarathonLocation("Boston");
		betsy.setMarathonLocation("London");
		
		System.out.println(mike);
		System.out.println(betsy);
		
		System.out.println("Runners in race: " + Athlete.getRunnersInRace());
		
	}

}
