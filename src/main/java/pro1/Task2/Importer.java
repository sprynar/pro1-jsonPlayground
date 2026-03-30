package pro1.Task2;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Importer {
    public static Double averageNameLength(Path inputFilePath) throws IOException {
        String json = Files.readString(inputFilePath);
        Station[] stanice = new Gson().fromJson(json, Station[].class);
        return Arrays.stream(stanice).mapToInt(s -> s.getName().length()).average().getAsDouble();
    }
}