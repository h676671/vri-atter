package no.hvl.dat100.prosjekt.modell;

import java.util.Arrays;
import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {

		Arrays.sort(samling.getSamling()), samling.getAntalKort());

	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Random random = new Random();

		Kort[] kort = samling.getSamling();
		int n = samling.getAntalKort();

		for (int i = n - 1 ; i > 0; i--) {
			int j = random.nextInt(i+1);

			//bytter om kortene her
			kort[i] = kort[j];
			Kort temp = kort[i];
			kort[j] = temp

		}
	}
	
}
