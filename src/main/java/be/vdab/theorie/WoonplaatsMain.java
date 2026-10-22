package be.vdab.theorie;

class WoonplaatsMain {
    void main() {
        var keuze = Integer.parseInt(
                IO.readln("1=woonplaatsen.txt, 2=woonplaatsen.xml: "));
        while (keuze != 1 && keuze != 2) {
            keuze = Integer.parseInt(
                    IO.readln("Verkeerde keuze, probeer opnieuw: "));
        }
        WoonplaatsRepository repository = keuze == 1
                ? new TxtWoonplaatsRepository()
                : new XmlWoonplaatsRepository();
        var service = new WoonplaatsService(repository);
        try {
            IO.println(service.maxAantalStreepjesInEenWoonplaats());
        } catch (RepositoryException ex) {
            IO.println("Kan woonplaatsen niet lezen.");
            ex.printStackTrace(System.err);
        }
    }
}
