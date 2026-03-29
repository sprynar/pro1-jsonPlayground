package pro1.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Importer {
    public static double averageNameLength(Path inputFilePath) throws IOException {
        var string = Files.readString(inputFilePath);

        // TODO: opravit, aby metoda vracela průměrnou délku názvu železniční stanice
        //  ze souboru ve formátu railwaystations.json

        return 15.4;
    }
}