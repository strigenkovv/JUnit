package be.vdab.oefeningen;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WoordTest {
    @Test
    void lepelIsEenPalindroom() {
        assertThat(new Woord("lepel").isPalindroom()).isTrue();
    }

    @Test
    void huisIsGeenPalindroom() {
        assertThat(new Woord("huis").isPalindroom()).isFalse();
    }
}
