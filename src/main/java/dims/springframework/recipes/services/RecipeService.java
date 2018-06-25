package dims.springframework.recipes.services;


import dims.springframework.recipes.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> getRecipes();
}
