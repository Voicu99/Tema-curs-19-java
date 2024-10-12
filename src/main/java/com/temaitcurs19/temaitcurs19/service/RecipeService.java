package com.temaitcurs19.temaitcurs19.service;

import com.temaitcurs19.temaitcurs19.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    private List<Recipe> recipeList = new ArrayList<>();

    public List<Recipe> getAllRecipes() {
        return recipeList;
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }
}

