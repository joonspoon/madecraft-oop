package examples;

import java.util.Random;

public class ExtraRandom extends Random {
	
	public String nextLetter() {
		int letterStartAt = 97;
		int randomInt = new Random().nextInt(26) + letterStartAt;
		
		return "" + (char)randomInt;
	}
}
