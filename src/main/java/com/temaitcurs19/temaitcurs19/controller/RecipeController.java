package com.temaitcurs19.temaitcurs19.controller;

import com.temaitcurs19.temaitcurs19.model.Recipe;
import com.temaitcurs19.temaitcurs19.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes")
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "recipes";  // Maps to the recipes.html template
    }

    @GetMapping("/recipe/add")
    public String addRecipeForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "add-recipe";  // Maps to the add-recipe.html template
    }

    @PostMapping("/recipe/add")
    public String addRecipe(@ModelAttribute Recipe recipe) {
        recipeService.addRecipe(recipe);
        return "redirect:/recipes";
    }
}

