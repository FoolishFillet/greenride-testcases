package org.alo.greenride;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;          // (2)
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TarifTest {


    @Test
    public void minusTageLeihen() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis (-1);
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(-1));
    }

    @Test
    void einTageLeihen() {
        //Arrange - Vorbereiten
        Tarif tarif = new Tarif();
        //Act - Ausführen
        int Preis = tarif.berechneMietpreis(1);
        // Assert - Pruefen
        assertEquals(10, Preis);
    }

    @Test
        void siebenTageLeihen(){
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(7);
        assertEquals(63, Preis);
    }

    @Test
    void dreiTageLeihen(){
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(3);
        assertEquals(27, Preis);
    }

    @Test
    void achtTageLeihen(){
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(8);
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(8));
    }


}
