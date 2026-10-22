package be.vdab.oefeningen;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class WoordTellerTest {
    private final WoordTeller teller = new WoordTeller();

    @Test
    void teltWoordenGescheidenDoorSpaties() {
        assertThat(teller.telWoorden("een twee drie"))
                .isEqualTo(3);
    }

    @Test
    void teltWoordenGescheidenDoorKommasEnSpaties() {
        assertThat(teller.telWoorden("een, twee,  drie"))
                .isEqualTo(3);
    }

    @Test
    void eenLegeZinBevatGeenWoorden() {
        assertThat(teller.telWoorden("   "))
                .isZero();
    }
}
