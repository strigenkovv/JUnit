package be.vdab.theorie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WoonplaatsServiceTest {
    private WoonplaatsService service;

    @BeforeEach
    void beforeEach() {
        service = new WoonplaatsService(new WoonplaatsRepository());
    }

    @Test
    void hetMaximumIsGroterOfGelijkAanNul() {
        assertThat(service.maxAantalStreepjesInEenWoonplaats())
                .isGreaterThanOrEqualTo(0);
    }
}
