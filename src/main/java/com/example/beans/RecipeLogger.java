package com.example.recipes.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RecipeLogger {
    public RecipeLogger() {
        System.out.println("Lazy RecipeLogger Initialized");
    }
}
