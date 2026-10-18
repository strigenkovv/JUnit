package be.vdab.oefeningen;

class Woord {
    private final String woord;

    Woord(String woord) {
        this.woord = woord;
    }

    boolean isPalindroom() {
        return woord.contentEquals(new StringBuilder(woord).reverse());
    }
}
