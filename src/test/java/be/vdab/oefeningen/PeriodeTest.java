package be.vdab.oefeningen;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PeriodeTest {
    private static final LocalDate EERSTE_JANUARI =
            LocalDate.of(2026, 1, 1);

    @Test
    void eenPeriodeKomtNaEenEerderePeriode() {
        var eerderePeriode = new Periode(
                EERSTE_JANUARI,
                EERSTE_JANUARI.plusDays(9));
        var laterePeriode = new Periode(
                EERSTE_JANUARI.plusDays(10),
                EERSTE_JANUARI.plusDays(19));

        assertThat(laterePeriode.komtNa(eerderePeriode)).isTrue();
    }

    @Test
    void eenPeriodeKomtNietNaEenLaterePeriode() {
        var eerderePeriode = new Periode(
                EERSTE_JANUARI,
                EERSTE_JANUARI.plusDays(9));
        var laterePeriode = new Periode(
                EERSTE_JANUARI.plusDays(10),
                EERSTE_JANUARI.plusDays(19));

        assertThat(eerderePeriode.komtNa(laterePeriode)).isFalse();
    }

    @Test
    void overlappendePeriodesGevenTrue() {
        var eerstePeriode = new Periode(
                EERSTE_JANUARI,
                EERSTE_JANUARI.plusDays(10));
        var tweedePeriode = new Periode(
                EERSTE_JANUARI.plusDays(5),
                EERSTE_JANUARI.plusDays(15));

        assertThat(eerstePeriode.overlaptMet(tweedePeriode)).isTrue();
    }

    @Test
    void NietOverlappendePeriodesGevenFalse() {
        var eerstePeriode = new Periode(
                EERSTE_JANUARI,
                EERSTE_JANUARI.plusDays(9));
        var tweedePeriode = new Periode(
                EERSTE_JANUARI.plusDays(10),
                EERSTE_JANUARI.plusDays(19));

        assertThat(eerstePeriode.overlaptMet(tweedePeriode)).isFalse();
    }
}
