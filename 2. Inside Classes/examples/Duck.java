package examples;

public class Duck {
	
	//member variables: data (encapsulated / private)
	private String name;
	private int lifeExpectany;
	private String favoriteFood;

	//Constructor: creating the instance
	public Duck(String name, int lifeExpectany, String favoriteFood) {
		super();
		this.name = name;
		this.lifeExpectany = lifeExpectany;
		this.favoriteFood = favoriteFood;
	}

	//methods: functionality//
	void waddle() {
		lifeExpectany++;
		System.out.println(this.name + " is waddling");
	}
	
	void quack() {
		System.out.println("quack quack");
	}

	@Override
	public String toString() {
		return "My name is " + name + " I like to eat " + favoriteFood + 
				" lifeExpectany: " + lifeExpectany;
}
}