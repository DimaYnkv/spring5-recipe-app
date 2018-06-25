package dims.springframework.recipes.repositories;

import dims.springframework.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    
}
