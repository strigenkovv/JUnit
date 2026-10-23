package be.vdab.oefeningen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class PaswoordTest {
    @Test
    void eenGeldigPaswoordKanJeMaken() {
        new Paswoord("Abcdefg1");
    }

    @Test
    void eenPaswoordMoetMinstens8TekensBevatten() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Paswoord("Abcde1"));
    }

    @Test
    void eenPaswoordMoetEenKleineLetterBevatten() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Paswoord("ABCDEFG1"));
    }

    @Test
    void eenPaswoordMoetEenHoofdletterBevatten() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Paswoord("abcdefg1"));
    }

    @Test
    void eenPaswoordMoetEenCijferBevatten() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Paswoord("Abcdefgh"));
    }

    @Test
    void getPuntjesGeeftEenPuntPerTeken() {
        assertThat(new Paswoord("Abcdefg1").getPuntjes())
                .isEqualTo("........");
    }
}
