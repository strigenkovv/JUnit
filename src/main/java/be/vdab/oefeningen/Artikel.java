package be.vdab.oefeningen;

import java.math.BigDecimal;

class Artikel {
    private final BigDecimal prijsExclusiefBtw;
    private final BigDecimal btwPercentage;

    Artikel(BigDecimal prijsExclusiefBtw, BigDecimal btwPercentage) {
        this.prijsExclusiefBtw = prijsExclusiefBtw;
        this.btwPercentage = btwPercentage;
    }

    BigDecimal getPrijsInclusiefBtw() {
        return prijsExclusiefBtw.multiply(
                BigDecimal.ONE.add(btwPercentage.divide(BigDecimal.valueOf(100))));
    }
}
