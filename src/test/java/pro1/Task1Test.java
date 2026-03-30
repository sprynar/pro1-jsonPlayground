package pro1;

import org.junit.jupiter.api.Test;
import pro1.Task1.Importer;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test
{
    @Test
    void test01() throws IOException, IOException {
        assertEquals(5, Importer.fiveRandomNumbers().length);
    }
}