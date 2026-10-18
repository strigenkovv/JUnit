package be.vdab.theorie;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VeilingTest {

    @Test
    @DisplayName("De hoogste bod van een nieuwe veiling is 0")
    void hoogsteBodVanEenNieuweVeilingIs0() {
        var veiling = new Veiling();

        assertThat(veiling.getHoogsteBod()).isZero();
    }

    @Test
    @DisplayName("Een bod wordt het hoogste bod")
    void eenBodWordtHetHoogsteBod() {
        var veiling = new Veiling();

        veiling.doeBod(new BigDecimal("1000"));

        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("1000");
    }

    @Test
    @DisplayName("Een hoger bod wordt het nieuwe hoogste bod")
    void eenHogerBodWordtHetNieuweHoogsteBod() {
        var veiling = new Veiling();

        veiling.doeBod(new BigDecimal("1000"));
        veiling.doeBod(new BigDecimal("2000"));

        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("2000");
    }

    @Test
    @DisplayName("Een lager bod verandert het hoogste bod niet")
    void eenLagerBodVerandertHetHoogsteBodNiet() {
        var veiling = new Veiling();

        veiling.doeBod(new BigDecimal("2000"));
        veiling.doeBod(new BigDecimal("1000"));

        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("2000");
    }
}
