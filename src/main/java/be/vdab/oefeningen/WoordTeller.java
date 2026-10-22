package be.vdab.oefeningen;

class WoordTeller {
    int telWoorden(String zin) {
        var tekst = zin.trim();
        return tekst.isEmpty() ? 0 : tekst.split("[ ,]+").length;
    }
}
