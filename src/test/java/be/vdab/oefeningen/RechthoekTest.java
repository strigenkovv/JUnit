package be.vdab.oefeningen;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class RechthoekTest {
    @Test
    void geeftDeOppervlakte() {
        assertThat(new Rechthoek(5, 3).getOppervlakte()).isEqualTo(15);
    }

    @Test
    void geeftDeOmtrek() {
        assertThat(new Rechthoek(5, 3).getOmtrek()).isEqualTo(16);
    }

    @Test
    void gelijkeRechthoekenZijnEqual() {
        assertThat(new Rechthoek(5, 3)).isEqualTo(new Rechthoek(5, 3));
    }

    @Test
    void ongelijkeRechthoekenZijnNietEqual() {
        assertThat(new Rechthoek(5, 3)).isNotEqualTo(new Rechthoek(5, 4));
    }

    @Test
    void gelijkeRechthoekenHebbenDezelfdeHashCode() {
        assertThat(new Rechthoek(5, 3).hashCode())
                .isEqualTo(new Rechthoek(5, 3).hashCode());
    }

    @Test
    void lengteMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Rechthoek(-1, 0));
    }

    @Test
    void breedteMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Rechthoek(1, -1));
    }

    @Test
    void lengteMagNietKleinerZijnDanBreedte() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Rechthoek(2, 3));
    }
}
