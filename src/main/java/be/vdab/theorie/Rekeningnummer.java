package be.vdab.theorie;

class Rekeningnummer {
    private final String nummer;

    Rekeningnummer(String nummer) {
        if (nummer.length() != 16) {
            throw new IllegalArgumentException("Nummer moet 16 tekens bevatten");
        }
        if (!nummer.startsWith("BE")) {
            throw new IllegalArgumentException("Nummer moet beginnen met BE");
        }
        try {
            var controleGetal = Long.valueOf(nummer.substring(2, 4));
            if (controleGetal < 2 || controleGetal > 98) {
                throw new IllegalArgumentException("Controlegetal moet tussen 2 en 98 liggen");
            }
            var teControlerenNummer = Long.valueOf(nummer.substring(4) + 1114) * 100
                    + controleGetal;
            if (teControlerenNummer % 97 != 1) {
                throw new IllegalArgumentException("Nummer bevat een verkeerde controleberekening");
            }
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Nummer moet cijfers bevatten vanaf de 3° positie");
        }
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return nummer;
    }
}
