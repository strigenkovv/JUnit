package be.vdab.theorie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

class XmlWoonplaatsRepository implements WoonplaatsRepository {
    @Override
    public List<String> findMetStreepjes() {
        var factory = XMLInputFactory.newInstance();
        var woonplaatsen = new ArrayList<String>();
        try (var bufferedReader = Files.newBufferedReader(
                Path.of("D:/opleding/Junit/JUnitMateriaal/woonplaatsen.xml"))) {
            var reader = factory.createXMLStreamReader(bufferedReader);
            while (reader.hasNext()) {
                reader.next();
                if (reader.isStartElement()
                        && "woonplaats".equals(reader.getLocalName())) {
                    var naam = reader.getAttributeValue(null, "naam");
                    if (naam.contains("-")) {
                        woonplaatsen.add(naam);
                    }
                }
            }
            return woonplaatsen;
        } catch (IOException | XMLStreamException ex) {
            throw new RepositoryException(ex);
        }
    }
}
