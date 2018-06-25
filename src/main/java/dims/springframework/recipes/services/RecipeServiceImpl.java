package dims.springframework.recipes.services;

import dims.springframework.recipes.domain.Recipe;
import dims.springframework.recipes.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        log.debug("Test service - im in the service");
//        log.error("xuy");
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        System.out.println("recipes service: returning recipes");
        return recipeSet;
    }
}
