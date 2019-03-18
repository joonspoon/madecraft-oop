package examples;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {
	
	public static void main(String[] args) {
		Disease polio = new Disease("polio", false);
		Disease flu = new Disease("influenza", true);
		Disease tuberculosis = new Disease("tuberculosis", false);
		
		List<Disease> diseases = new ArrayList<Disease>();
		diseases.add(polio);
		diseases.add(flu);
		diseases.add(tuberculosis);
		
		/* print all the incurable diseases */
		for (Disease disease : diseases) {
			if (!disease.isCurable()) {
				System.out.println(disease.getName());
			}
		}
		
	}
	
}
