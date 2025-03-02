package com.example.recipes.beans;

import org.springframework.stereotype.Component;

@Component
public class RecipeCache {
    public RecipeCache() {
        System.out.println("Eager RecipeCache Initialized");
    }
}
