package be.vdab.theorie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WoonplaatsServiceTest {
    private WoonplaatsService service;

    @BeforeEach
    void beforeEach() {
        service = new WoonplaatsService(new WoonplaatsRepositoryStub());
    }

    @Test
    void hetMaximumIs2() {
        assertThat(service.maxAantalStreepjesInEenWoonplaats())
                .isEqualTo(2);
    }
}
