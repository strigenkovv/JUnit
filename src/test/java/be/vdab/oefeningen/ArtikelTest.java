package be.vdab.oefeningen;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ArtikelTest {
    @Test
    void geeftDePrijsInclusiefBtw() {
        var artikel = new Artikel(new BigDecimal("100"), new BigDecimal("21"));

        assertThat(artikel.getPrijsInclusiefBtw()).isEqualByComparingTo("121");
    }
}
