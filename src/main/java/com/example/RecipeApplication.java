package com.example.recipes;

import com.example.recipes.config.AppConfig;
import com.example.recipes.service.RecipeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RecipeApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RecipeService italianService = context.getBean(com.example.recipes.service.ItalianRecipeService.class);
        RecipeService asianService = context.getBean("asianService", RecipeService.class);

        System.out.println(italianService.getRecipe(1));
        System.out.println(asianService.getRecipe(2));

        // Доступ к ленивому бину
        context.getBean(com.example.recipes.beans.RecipeLogger.class);
        context.close();
    }
}
