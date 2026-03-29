package pro1.Task1;

import pro1.DataSourceUtils;
import java.io.IOException;

public class Importer {
    public static int[] fiveRandomNumbers() throws IOException {
        var resp = DataSourceUtils.getFromUri("http://www.randomnumberapi.com/api/v1.0/random?min=100&max=1000&count=5");

        // TODO: opravit, aby metoda vracela pole čísel získaných z randomnumberapi.com

        return new int[]{600,650,700,750,800};
    }
}