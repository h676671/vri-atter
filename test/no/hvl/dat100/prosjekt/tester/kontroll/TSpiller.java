package no.hvl.dat100.prosjekt.tester.kontroll;

import no.hvl.dat100.prosjekt.kontroll.Spiller;
import no.hvl.dat100.prosjekt.kontroll.spill.Handling;
import no.hvl.dat100.prosjekt.kontroll.spill.HandlingsType;
import no.hvl.dat100.prosjekt.modell.Kort;

public class TSpiller extends Spiller {

	//dummy metode for å kunne teste den abstrakte klassen Spiller
	public Handling nesteHandling(Kort topp)
	{
		return new Handling(HandlingsType.TREKK,null);
	}
}
