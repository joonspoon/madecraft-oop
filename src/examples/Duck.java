package examples;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Duck {

	private String favoriteFood;
	private int lifeExpectancy;
	

	public Duck(String favoriteFood, int lifeExpectancy) {
		this.favoriteFood = favoriteFood;
		this.lifeExpectancy = lifeExpectancy;
	}

	public void waddle() {
		lifeExpectancy++;
		System.out.println("waddle waddle");
	}

	@Override
	public String toString() {
		return "This duck likes to eat " + this.favoriteFood + " and will live to be " + this.lifeExpectancy + ".";
	}
	
	public void quack() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/quack.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
