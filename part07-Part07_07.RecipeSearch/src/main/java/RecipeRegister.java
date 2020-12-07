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
import java.util.Scanner;
public class RecipeRegister {
    private ArrayList<Recipe> recipes;
    private Scanner scanner = new Scanner(System.in);
    
    public RecipeRegister() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public boolean findName(String name) {
        while (true) {
            for (Recipe recipe : recipes) {
                if (recipe.getName().toLowerCase().contains(name)) {
                    System.out.println("");
                    System.out.println("Recipes:");
                    System.out.println(recipe);
                    System.out.println("");
                    return true;
                }
            }
            return false;
        }
    }
    
    public void printRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println("");
            System.out.println(recipe.getName() + "\n" + 
                    recipe.getCookTime());
            recipe.listIngredients();
        }
    }
    
    public void findTime(int time) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookTime() <= time) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    public void findIngredient() {
        System.out.println("");
        System.out.print("Enter ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.hasIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
}
