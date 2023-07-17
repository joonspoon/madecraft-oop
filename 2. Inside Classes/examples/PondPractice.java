package examples;

public class PondPractice {
	public static void main(String[] args) {
		String me = "june";
		
		//<type> <name> = new <type>()
		DuckPractice mobyDuck = new DuckPractice("Moby", 90/3, "celery");
		
		mobyDuck.quack();
		mobyDuck.waddle();
		mobyDuck.waddle();
		
		System.out.println(mobyDuck);
				
	}
}
