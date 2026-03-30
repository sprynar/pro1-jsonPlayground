package pro1.Task3;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Importer {
    public static String summary(Path inputFilePath) throws IOException {
        String json = Files.readString(inputFilePath);
        IndicatorData data = new Gson().fromJson(json, IndicatorData.class);
        return data.isDfd() + "," +
                data.isEnterprise() + "," +
                data.isButton();
    }
}