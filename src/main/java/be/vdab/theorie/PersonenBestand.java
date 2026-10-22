package be.vdab.theorie;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class PersonenBestand {
    public static void main(String[] args) throws IOException {
        var voornamen = new String[] {
                "Arthur", "Noa", "Adam", "Louis", "Liam",
                "Emma", "Olivia", "Louise", "Mila"
        };
        var familienamen = new String[] {
                "Peeters", "Janssens", "Maes", "Jacobs",
                "Mertens", "Willems", "Claes"
        };
        var random = new Random();
        var bestand = Path.of("d:/opleding/Junit/data/personen.csv");

        Files.createDirectories(bestand.getParent());
        try (var writer = new PrintWriter(Files.newBufferedWriter(bestand))) {
            for (var i = 1; i <= 10_000_000; i++) {
                writer.print(i);
                writer.print(',');
                writer.print(voornamen[random.nextInt(voornamen.length)]);
                writer.print(',');
                writer.print(familienamen[random.nextInt(familienamen.length)]);
                writer.print(',');
                writer.print(2_000 + random.nextInt(3_000));
                writer.print('.');
                writer.println(random.nextInt(100));
            }
        }
        System.out.println("Bestand gemaakt");
    }
}
