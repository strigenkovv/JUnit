package be.vdab.oefeningen;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ISBNTest {

    @Test
    void ISBN9789027439642IsCorrect() {
        new ISBN(9789027439642L);
    }

    @Test
    void ISBN978902743964IsTeKort() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new ISBN(978902743964L));
    }

    @Test
    void ISBN97890274396420IsTeLang() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new ISBN(97890274396420L));
    }

    @Test
    void ISBN9779027439642HeeftEenVerkeerdeStart() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new ISBN(9779027439642L));
    }


    @Test
    void ISBN9789027439643HeeftEenVerkeerdControlegetal() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new ISBN(9789027439643L));
    }


    @Test
    void ISBN9790000000001IsCorrect() {
        new ISBN(9790000000001L);
    }

    @Test
    void ISBN9780200000000IsCorrect() {
        new ISBN(9780200000000L);
    }

    @Test
    void toStringGeeftHetISBNTerug() {
        var nummer = 9789027439642L;

        assertThat(new ISBN(nummer))
                .hasToString("9789027439642");
    }
}