package be.vdab.theorie;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

class PersoonRepositoryStub extends CsvPersoonRepository {
    // Учебный пример Stub. В PersoonServiceTest теперь используется Mockito Mock.
    @Override
    List<BigDecimal> findAllWeddes() {
        return Stream.of(2, 4, 4, 4, 5, 5, 7, 9)
                .map(BigDecimal::valueOf)
                .toList();
    }
}
