package pro1;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test
{
    @Test
    void test01() throws IOException {
        // TODO: Nechat
        assertEquals(
                12.02,
                pro1.Task2.Importer.averageNameLength(
                        Paths.get("src","test","resources", "railwaystations.json")),
                0.01
        );
    }
}