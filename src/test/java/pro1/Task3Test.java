package pro1;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test
{
    @Test
    void test01() throws IOException {
        // TODO: Nechat
        assertEquals(
                "false,true,false",
                pro1.Task3.Importer.summary(
                        Paths.get("src","test","resources", "indicator.json"))
        );
    }
}