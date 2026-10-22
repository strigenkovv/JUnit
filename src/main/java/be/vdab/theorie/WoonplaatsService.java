package be.vdab.theorie;

class WoonplaatsService {
    private final WoonplaatsRepository repository;

    WoonplaatsService(WoonplaatsRepository repository) {
        this.repository = repository;
    }

    long maxAantalStreepjesInEenWoonplaats() {
        return repository.findMetStreepjes().stream()
                .mapToLong(woonplaats -> woonplaats.chars()
                        .filter(teken -> teken == '-')
                        .count())
                .max()
                .orElse(0);
    }
}
