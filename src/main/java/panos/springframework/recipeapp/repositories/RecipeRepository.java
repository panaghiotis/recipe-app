package panos.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import panos.springframework.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
