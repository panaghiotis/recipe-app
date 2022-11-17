package panos.springframework.recipeapp.services;

import panos.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
