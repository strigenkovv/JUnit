package be.vdab.theorie;

class Main {
    void main() {
        var keuze = Integer.parseInt(
                IO.readln("1=personen.csv, 2=personen.xml: "));
        while (keuze != 1 && keuze != 2) {
            keuze = Integer.parseInt(
                    IO.readln("Verkeerde keuze, probeer opnieuw: "));
        }
        PersoonRepository repository = keuze == 1
                ? new CsvPersoonRepository()
                : new XmlPersoonRepository();
        var service = new PersoonService(repository);
        try {
            IO.println(service.standaardAfwijkingWeddes());
        } catch (RepositoryException ex) {
            IO.println("Kan personen niet lezen.");
            ex.printStackTrace(System.err);
        }
    }
}
