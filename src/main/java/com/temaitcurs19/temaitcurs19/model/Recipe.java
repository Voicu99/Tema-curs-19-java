package com.temaitcurs19.temaitcurs19.model;

public class Recipe {
    private String title;
    private String ingredients;
    private String description;
    private String preparationSteps;
    private int cookingTime;  // in minutes

    // No-argument constructor
    public Recipe() {
    }

    // Parameterized constructor
    public Recipe(String title, String ingredients, String description, String preparationSteps, int cookingTime) {
        this.title = title;
        this.ingredients = ingredients;
        this.description = description;
        this.preparationSteps = preparationSteps;
        this.cookingTime = cookingTime;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(String preparationSteps) {
        this.preparationSteps = preparationSteps;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
}

