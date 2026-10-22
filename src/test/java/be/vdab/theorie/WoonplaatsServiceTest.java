package be.vdab.theorie;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WoonplaatsServiceTest {
    @Mock
    private WoonplaatsRepository repository;
    private WoonplaatsService service;

    @BeforeEach
    void beforeEach() {
        service = new WoonplaatsService(repository);
    }

    @Test
    void hetMaximumIs2() {
        when(repository.findMetStreepjes()).thenReturn(
                List.of("A-B", "A-B-C", "A"));

        assertThat(service.maxAantalStreepjesInEenWoonplaats())
                .isEqualTo(2);

        verify(repository).findMetStreepjes();
    }
}
