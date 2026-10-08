package org.alo.greenride;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;          // (2)
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TarifTest {

    @Test
    void einOderzweiTageLeihen() {
        //Arrange - Vorbereiten
        Tarif tarif = new Tarif();
        //Act - Ausführen
        int tage = tarif.berechneMietpreis(1);
        assertEquals(10, Preis);
    }
}
