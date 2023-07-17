package examples;

public class CharacterPractice {

	private String name;
	private String species;

	public CharacterPractice(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	public static void main(String[]args) {
		CharacterPractice bilbo = new CharacterPractice("Bilbo", "Hobbit");
		CharacterPractice legolas = new CharacterPractice("Legolas", "Elf");
	}
}