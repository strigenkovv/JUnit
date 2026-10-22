package be.vdab.theorie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonServiceTest {
    private PersoonService service;

    @BeforeEach
    void beforeEach() {
        service = new PersoonService(new PersoonRepositoryStub());
    }

    @Test
    void deWeddeStandaardAfwijkingIs2() {
        assertThat(service.standaardAfwijkingWeddes())
                .isEqualByComparingTo("2");
    }
}
