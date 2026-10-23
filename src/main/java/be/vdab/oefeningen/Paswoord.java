package be.vdab.oefeningen;

class Paswoord {
    private final String paswoord;

    Paswoord(String paswoord) {
        if (paswoord.length() < 8
                || !paswoord.matches(".*[a-z].*")
                || !paswoord.matches(".*[A-Z].*")
                || !paswoord.matches(".*[0-9].*")) {
            throw new IllegalArgumentException();
        }
        this.paswoord = paswoord;
    }

    String getPuntjes() {
        return ".".repeat(paswoord.length());
    }
}
