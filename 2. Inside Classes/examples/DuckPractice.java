package examples;

public class DuckPractice {

	// member variable: data
	private String name;
	private int lifeExpectancy;
	private String favoriteFood;

	public DuckPractice(String name, int lifeExpectancy, String favoriteFood) {
		super();
		this.name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.favoriteFood = favoriteFood;
	}

	// methods: functionality
	void waddle() {
		String message = String.format("%s is waddling.", this.name);
		System.out.println(message);
		lifeExpectancy ++;
	}

	void quack() {
		System.out.println("quack quack");
	}

	@Override
	public String toString() {
		String message = String.format("%s likes %s. Life expectancy is %d", name, favoriteFood, lifeExpectancy);
		return message.toString();
	}

}
