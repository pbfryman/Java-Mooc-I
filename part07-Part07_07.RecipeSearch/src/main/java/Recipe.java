/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookTime() {
        return this.cookTime;
    }
    
    public void listIngredients() {
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }
    
    public boolean hasIngredient(String value) {
        for (String ingredient : ingredients) {
            if (ingredient.equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return this.name + ", Cook Time: " + this.cookTime;
    }
}
