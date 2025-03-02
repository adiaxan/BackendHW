package com.example.recipes.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class RecipeRepository {
    private final Map<Integer, String> recipes = new HashMap<>();

    public RecipeRepository() {
        recipes.put(1, "Spaghetti Carbonara");
        recipes.put(2, "Chicken Curry");
    }

    public String getRecipeById(int id) {
        return recipes.getOrDefault(id, "Recipe not found");
    }
}
