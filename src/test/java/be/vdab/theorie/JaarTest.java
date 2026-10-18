package be.vdab.theorie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.assertj.core.api.Assertions;

class JaarTest {
    @Test
    @DisplayName("Een jaar deelbaar door 400 is een schrikkeljaar.")
    void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
        Assertions.assertThat(new Jaar(2000).isSchrikkeljaar()).isTrue();
    }

    @Test
    void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
        Assertions.assertThat(new Jaar(1900).isSchrikkeljaar()).isFalse();
    }

    @Test
    void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
        Assertions.assertThat(new Jaar(2012).isSchrikkeljaar()).isTrue();
    }

    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
        Assertions.assertThat(new Jaar(2015).isSchrikkeljaar()).isFalse();
    }

    @Test
    void toStringGeeftHetJaarAlsTekstMetIsEqualTo() {
        Assertions.assertThat(new Jaar(2015).toString()).isEqualTo("2015");
    }

    @Test
    void toStringGeeftHetJaarAlsTekstMetHasToString() {
        Assertions.assertThat(new Jaar(2015)).hasToString("2015");
    }
}
