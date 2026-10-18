package be.vdab.oefeningen;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RechthoekTest {
    @Test
    void geeftDeOppervlakte() {
        assertThat(new Rechthoek(5, 3).getOppervlakte()).isEqualTo(15);
    }

    @Test
    void geeftDeOmtrek() {
        assertThat(new Rechthoek(5, 3).getOmtrek()).isEqualTo(16);
    }
}
