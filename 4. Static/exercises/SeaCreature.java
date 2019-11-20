package exercises;

/*
 * 1. Create a class called Ocean.
 * 2. There make make a SeaCreature called “Spongebob”. 
 * 3. Use the methods below to make him eat, and laugh.
 * 4. Make Patrick and Squidward and print their name, and make them laugh.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreature {
	
	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
