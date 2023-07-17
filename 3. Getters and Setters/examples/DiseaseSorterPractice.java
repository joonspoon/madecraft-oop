package examples;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorterPractice {

	public static void main(String[] args) {
		DiseasePractice polio = new DiseasePractice("polio", false);
		DiseasePractice flu = new DiseasePractice("flu", true);
		DiseasePractice malaria = new DiseasePractice("malaria", true);
		DiseasePractice cancer = new DiseasePractice("cancer", false);

		List<DiseasePractice> diseases = new ArrayList<DiseasePractice>();
		diseases.add(polio);
		diseases.add(flu);
		diseases.add(malaria);
		diseases.add(cancer);

		cancer.setCurable(true);
		
		// print all incurable diseases
		for (DiseasePractice disease : diseases) {
			if(disease.isCurable() == false) {
				System.out.println(disease.getName());
			}
		}
		
		DiseasePractice fever = new DiseasePractice();
		fever.setCurable(true);
		fever.setName("fever");
		
		System.out.println(fever.getName());
		System.out.println(fever.isCurable());
	}
}
