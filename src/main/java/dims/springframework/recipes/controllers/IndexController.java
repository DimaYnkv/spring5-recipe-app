package dims.springframework.recipes.controllers;


import dims.springframework.recipes.domain.Category;
import dims.springframework.recipes.domain.UnitOfMeasure;
import dims.springframework.recipes.repositories.CategoryRepository;
import dims.springframework.recipes.repositories.UnitOfMeasureRepository;
import dims.springframework.recipes.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;

    private final RecipeService recipeService;


    public IndexController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
