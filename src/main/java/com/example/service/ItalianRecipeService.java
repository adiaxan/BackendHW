package com.example.recipes.service;

import com.example.recipes.repository.RecipeRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ItalianRecipeService implements RecipeService {
    private final RecipeRepository repository;

    public ItalianRecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getRecipe(int id) {
        return "Italian Dish: " + repository.getRecipeById(id);
    }
}
