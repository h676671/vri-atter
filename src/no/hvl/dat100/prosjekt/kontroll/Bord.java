package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.kontroll.spill.Spillere;
import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Klasse som implementerer bordet som spilles på.
 * <p>
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til å representere
 * kortene som er i de to bunker på border.
 */
public class Bord {

    private KortSamling bunkeFra;
    private KortSamling bunkeTil;

    /**
     * Metoden oppretter to bunker, til- og fra-bunken
     * Alle kortene legges til fra-bunken.
     */
    public Bord() {
        //TODO - Start
        bunkeFra = new KortSamling();
        bunkeFra.leggTilAlle();
        bunkeTil = new KortSamling();
        //TODO - End

        //bunkeFra.leggTil(Kort);

    }

    /**
     * Gir peker/referanse til til-bunken.
     *
     * @return referanse/peker til til-bunken.
     */
    public KortSamling getBunkeTil() {
        //TODO - Start
        return bunkeTil;
        //TODO - End
    }

    /**
     * Gir peker/referanse til fra-bunken.
     *
     * @return referanse/peker til fra-bunken.
     */
    public KortSamling getBunkeFra() {
        //TODO - Start
       return this.bunkeFra;
        //TODO - End
    }

    /**
     * Sjekker om til-bunken er tom.
     *
     * @return true om til-bunken er tom, false ellers.
     */
    public boolean bunketilTom() {
        //TODO - Start
        return bunkeTil.erTom();
        //TODO - End
    }

    /**
     * Sjekker om fra-bunken er tom.
     *
     * @return true om fra-bunken er tom, false ellers.
     */
    public boolean bunkefraTom() {
        //TODO - Start
        return bunkeFra.erTom();
        //TODO - End
    }

    /**
     * Gir antall kort i fra-bunken.
     *
     * @return antall kort i fra-bunken.
     */
    public int antallBunkeFra() {
        //TODO - Start
        return bunkeFra.getAntalKort();
        //TODO - End
    }

    /**
     * Gir antall kort i til-bunken.
     *
     * @return antall kort i til-bunken.
     */
    public int antallBunkeTil() {
        //TODO - Start
        return bunkeTil.getAntalKort();
        //TODO - End
    }

    /**
     * Tar øverste kortet fra fra-bunken og legger dettte til til-bunken (med
     * billedsiden opp, men det trenger ikke gruppen tenke på).
     */
    public void vendOversteFraBunke() {
        //TODO - Start
        Kort toppKort = bunkeFra.taSiste();
        bunkeTil.leggTil(toppKort);
        //TODO - End
    }

    /**
     * Tar øverste kortet fra fra-bunken.
     *
     * @return peker/referanse til det kort som blev tatt fra fra-bunken
     */

    public Kort taOversteFraBunke() {
        //returnerer øverste kortet fra "bunkeFra"

        //kan også: Kort toppKort = bunkeFra.taSiste();
        //TODO - Start
        return bunkeFra.taSiste();
        //TODO - End

    }

    /**
     * Metode som leser øverste kortet i til-bunken. Kortet vil fremdeles være
     * øverst i til-bunken etter at metoden er utført.
     *
     * @return peker/referanse til øverste kortet i til-bunken.
     */
    public Kort seOversteBunkeTil() {
        //TODO - Start
        return bunkeTil.taSiste();
        //TODO - End

    }

    /**
     * Når fra-bunken blir tom, tar man vare på kortet pÂ toppen av til-bunken.
     * Deretter legges alle den andre kortene i til-bunken over i fra-bunken.
     * Denne stokkes og kortet som man har tatt vare pÂ legges tilbake i
     * til-bunken. Det vil nå være det eneste kortet i til-bunken.
     */
    public void snuTilBunken() {
        //TODO - Start
        if (bunkeFra.erTom()) {
            Kort kortOnTop = bunkeTil.taSiste();
            bunkeFra.fjernAlle();
            bunkeFra.leggTilAlle();
            KortUtils.stokk(bunkeFra);
            bunkeTil.leggTil(kortOnTop);
        } else {
            System.out.println("nei :3");
        }
        //TODO - End
    }

    /**
     * Metode som legger et kort i til-bunken.
     *
     * @param k kort som skal legges ned.
     */
    public void leggNedBunkeTil(Kort k) {
        //TODO - Start
        bunkeTil.leggTil(k);
        //TODO - End

    }
}
