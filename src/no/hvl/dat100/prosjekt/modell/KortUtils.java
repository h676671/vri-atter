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

		Arrays.sort(samling.getSamling());

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
		int antalKort = samling.getAntalKort();

		for (int i = 0 ; i < antalKort; i++) {
			int j = random.nextInt(antalKort);

			//bytter om kortene her
			Kort kort1 = kort[i];
			Kort kort2 = kort[j];
			kort[i] = kort2;
			kort[j] = kort1;
		}
	}
	
}
