package pro1;

import org.junit.jupiter.api.Test;
import pro1.Task1.Importer;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test
{
    @Test
    void test01() throws IOException {
        // TODO: Předělat na volnější test, který zkontroluje pouze délku pole
        assertArrayEquals(
                new int[]{11,52,713,50,60},
                Importer.fiveRandomNumbers());
    }
}