package be.vdab.theorie;

import java.math.BigDecimal;
import java.util.Arrays;

class Statistiek {
    static BigDecimal getGemiddelde(BigDecimal[] getallen) {
        if (getallen.length == 0) {
            throw new IllegalArgumentException("Lege array");
        }
        var som = BigDecimal.ZERO;
        for (var getal : getallen) {
            som = som.add(getal);
        }
        //return som.divide(BigDecimal.valueOf(getallen.length));

        return Arrays.stream(getallen)
                     .reduce(BigDecimal.ZERO, (vorigTotaal, getal) -> vorigTotaal.add(getal))
                     .divide(BigDecimal.valueOf(getallen.length));
    }
}
