package pro1.Task4;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Importer {
    public static double getShoppingItem(Path inputFilePath, String ingredientName) throws IOException {
        String json = Files.readString(inputFilePath);
        FoodData data = new Gson().fromJson(json, FoodData.class);
        Map<String, Double> amountPerRecipe = new HashMap<>();
        for (FoodData.Recipe recipe : data.recipes) {
            for (FoodData.RecipeItem item : recipe.recipeItems) {
                if (item.ingredientName.equals(ingredientName)) {
                    amountPerRecipe.put(recipe.name, item.amountPerPerson);
                }
            }
        }
        double totalAmount = 0;
        for (FoodData.Occasion occasion : data.occasions) {
            for (String recipeName : occasion.recipesNames) {
                double amountPerPerson = amountPerRecipe.getOrDefault(recipeName, 0.0);
                totalAmount += amountPerPerson * occasion.personsCount;
            }
        }

        return totalAmount;
    }
}