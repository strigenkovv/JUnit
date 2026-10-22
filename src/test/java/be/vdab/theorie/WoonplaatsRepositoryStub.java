package be.vdab.theorie;

import java.util.List;

class WoonplaatsRepositoryStub extends TxtWoonplaatsRepository {
    @Override
    List<String> findMetStreepjes() {
        return List.of("A-B", "A-B-C", "A");
    }
}
