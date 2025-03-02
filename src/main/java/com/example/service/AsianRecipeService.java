package com.example.recipes.service;

import com.example.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("asianService")
public class AsianRecipeService implements RecipeService {
    private final RecipeRepository repository;

    public AsianRecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getRecipe(int id) {
        return "Asian Dish: " + repository.getRecipeById(id);
    }
}
