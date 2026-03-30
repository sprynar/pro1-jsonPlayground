package pro1.Task1;

import pro1.DataSourceUtils;
import com.google.gson.Gson;
import java.io.IOException;

public class Importer {
    public static int[] fiveRandomNumbers() throws IOException {
        return new Gson().fromJson(
                DataSourceUtils.getFromUri(
                        "http://www.randomnumberapi.com/api/v1.0/random?min=100&max=1000&count=5"
                ),
                int[].class
        );
    }
}