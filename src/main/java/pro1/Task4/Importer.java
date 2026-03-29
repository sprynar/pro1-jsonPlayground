package pro1.Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Importer {
    public static double getShoppingItem(Path inputFilePath, String ingredientName) throws IOException {
        var string = Files.readString(inputFilePath);

        // TODO 1: zajistit, aby se do proměnné data načetla všechna data ze souboru jako je food.json

        // TODO 2: spočítat, jaké množství ingredience "ingredientName" je potřeba koupit

        return 0;
    }
}