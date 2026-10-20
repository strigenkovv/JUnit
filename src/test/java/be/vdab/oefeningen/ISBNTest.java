package be.vdab.oefeningen;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class ISBNTest {

    @ParameterizedTest
    @ValueSource(longs = {9789027439642L, 9790000000001L, 9780200000000L})
    void correcteISBNs(long nummer) {
        new ISBN(nummer);
    }

    @ParameterizedTest
    @ValueSource(longs = {978902743964L, 97890274396420L})
    void eenISBNMoet13CijfersBevatten(long nummer) {
        assertThatIllegalArgumentException().isThrownBy(() -> new ISBN(nummer));
    }

    @ParameterizedTest
    @ValueSource(longs = {9779027439642L, 9789027439643L})
    void eenISBNMoetEenJuisteStartEnControlegetalHebben(long nummer) {
        assertThatIllegalArgumentException().isThrownBy(() -> new ISBN(nummer));
    }

    @Test
    void toStringGeeftHetISBNTerug() {
        var nummer = 9789027439642L;

        assertThat(new ISBN(nummer))
                .hasToString("9789027439642");
    }
}
