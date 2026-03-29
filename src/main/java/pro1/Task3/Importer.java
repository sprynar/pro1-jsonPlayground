package pro1.Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Importer {
    public static String summary(Path inputFilePath) throws IOException {
        var string = Files.readString(inputFilePath);

        // TODO: opravit, aby metoda vracela např. "false,true,false"
        //  podle souboru ve formátu railwaystations.json.
        //  Využít přitom třídu IndicatorData a zachovat názvy jejích fields

        return "";
    }
}