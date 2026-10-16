package be.vdab.theorie;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class JaarTest {
    @Test
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
    void toStringGeeftHetJaarAlsTekst() {
        Assertions.assertThat(new Jaar(2024).toString()).isEqualTo("2024");
    }
}
