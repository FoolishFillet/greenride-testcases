package org.alo.greenride;

/**
 * Der Mehrtagestarif von GreenRide (gilt ab 01.11.).
 */
public class Tarif {

    /**
     * Berechnet den Mietpreis fuer eine Ausleihe ueber mehrere Tage.
     * Ein Tag kostet 10 Euro. Ab 3 Tagen kostet jeder Tag nur 9 Euro.
     * Ausgeliehen wird mindestens 1 und hoechstens 7 Tage.
     *
     * @param tage die Anzahl der Tage
     * @return der Mietpreis in ganzen Euro
     * @throws IllegalArgumentException wenn tage kleiner als 1 oder groesser als 7 ist
     */
    public static int berechneMietpreis(int tage) {

        if( tage < 1){

            throw new IllegalArgumentException(
                    "Unter einem Tag keine Miete:" + tage
            );
        }

        if (tage > 7) {
            throw new IllegalArgumentException(
                    "Mehr als 7 sind zu viel" + tage
            );
        }


        if (tage >= 3) {
            return tage * 9;
        }
        return tage * 10;
    }
}
