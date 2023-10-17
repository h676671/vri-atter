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
		//TODO - Start

		//Bruker bubblesort :)

		int antallKort = samling.getAntalKort();
		Kort[] kortstokk = samling.getSamling();

		for (int i = 0; i < (antallKort - 1); i++){
			for (int j = 0; j < (antallKort - 1); j++){
				Kort kort1 = kortstokk[j];
				Kort kort2 = kortstokk[j + 1];

				if (kort1.compareTo(kort2) > 0){
					kortstokk[j] = kort2;
					kortstokk[j+1] = kort1;
				}
			}
		}
		//TODO - End
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
