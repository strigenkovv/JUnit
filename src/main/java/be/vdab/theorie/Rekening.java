package be.vdab.theorie;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;
    private final List<BigDecimal> stortingen = new ArrayList<>();

    void stort(BigDecimal bedrag) {
        if (bedrag.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Bedrag moet positief zijn");
        }
        saldo = saldo.add(bedrag);
        stortingen.add(bedrag);
    }

    BigDecimal getSaldo() {
        return saldo;
    }

    List<BigDecimal> getStortingen() {
        return stortingen;
    }

    List<BigDecimal> getStortingenGesorteerd() {
        return stortingen.stream().sorted().toList();
    }
}
