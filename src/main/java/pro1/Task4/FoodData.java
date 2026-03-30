package pro1.Task4;

import java.util.List;

public class FoodData {
    public List<Occasion> occasions;
    public List<Recipe> recipes;

    public static class Occasion {
        public int personsCount;
        public List<String> recipesNames;
    }

    public static class Recipe {
        public String name;
        public List<RecipeItem> recipeItems;
    }

    public static class RecipeItem {
        public String ingredientName;
        public double amountPerPerson;
    }
}