package be.vdab.oefeningen;

import java.time.LocalDate;

class Periode {
    private final LocalDate van;
    private final LocalDate tot;

    Periode(LocalDate van, LocalDate tot) {
        this.van = van;
        this.tot = tot;
    }

    boolean komtNa(Periode periode) {
        return van.isAfter(periode.tot);
    }

    boolean overlaptMet(Periode periode) {
        return !van.isAfter(periode.tot)
                && !periode.van.isAfter(tot);
    }
}
