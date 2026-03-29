package pro1;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test
{
    @Test
    void test01() throws IOException {
        // TODO: Nechat
        assertEquals(
                9.8,
                pro1.Task4.Importer.getShoppingItem(
                        Paths.get("src","test","resources", "food.json"),
                        "cibule (ks)"),
                0.01
        );
    }
}