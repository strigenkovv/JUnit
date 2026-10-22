package be.vdab.theorie;

class Main {
    void main() {
        try {
            var service = new PersoonService(new PersoonRepository());
            System.out.println(service.standaardAfwijkingWeddes());
        } catch (RepositoryException ex) {
            System.out.println("Kan personen niet lezen.");
            ex.printStackTrace(System.err);
        }
    }
}
