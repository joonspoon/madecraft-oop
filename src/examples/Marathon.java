package examples;

public class Marathon {
	
//Athletes:
	//instance specific data: name, speed
	//static data: number of runners, location of marathon
	
	public static void main(String[] args) {
		Athlete john = new Athlete("john", 10);
		Athlete betsy = new Athlete("betsy", 12);
		
		john.setLocation("San Diego");
		betsy.setLocation("London");
		System.out.println(betsy);
		System.out.println(john);
		
		System.out.println("Runners in race: " + Athlete.getNumberOfRunners());
	}

}
