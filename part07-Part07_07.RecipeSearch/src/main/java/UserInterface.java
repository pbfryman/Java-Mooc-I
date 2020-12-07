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
import java.nio.file.Paths;

public class UserInterface {
    private Recipe recipe;
    private RecipeRegister register;
    private Scanner scanner;
    
    public UserInterface(RecipeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void findFile() {
        while (true) {
            System.out.print("Enter file name: ");
            String input = scanner.nextLine();
            
            try (Scanner fileScan = new Scanner(Paths.get(input))) {
                // read and store recipes
                while (fileScan.hasNextLine()) {                    
                    String name = fileScan.nextLine();
                    int cookTime = Integer.valueOf(fileScan.nextLine());
                    ArrayList<String> ingredients = new ArrayList<>();
                    while (fileScan.hasNextLine()) {
                        String line = fileScan.nextLine();
                        if (line.isEmpty()) {
                            break;
                        } else {
                            ingredients.add(line);
                        }
                    }
                    register.addRecipe(new Recipe(name, cookTime, ingredients));
                }
                break;
                
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage()); // print if no file found
            }
        }
        printCommands();
    }
    
    private void printCommands() {
        loop: while (true) {
            System.out.println("");
            System.out.println("Commands: \n" + "list - lists the recipes\n" +
                "find name - searches recipes by name\n" + 
                    "find cooking time - searches recipes by cook time\n" + 
                    "find ingredient - searches recipes by ingreditent\n" + 
                    "stop - stops the program");
            System.out.println("");
            String command = getCommand();

            switch (command) {
                case "list":
                    register.printRecipes();
                    break;
                case "find name":
                    findName();
                    break;
                case "find cooking time":
                    findTime();
                    break;
                case "find ingredient":
                    register.findIngredient();
                    break;
                case "stop":
                    System.out.println("");
                    System.out.println("Quitting application...");
                    break loop;
            }
        }

    }
    
    private String getCommand() {
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("list") || input.equals("stop") || input.equals("find name")
                    || input.equals("find cooking time") || input.equals("find ingredient")) {
                return input;
            }
        }
    }
    
    private void findName() {
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine().toLowerCase();
            if (register.findName(name) == false) {
                System.out.println("");
                System.out.println("Recipe not found.");
                System.out.println("");
                break;
            } else {
                break;
            }
        }
    }
    
    private void findTime() {
        while (true) {
            System.out.print("Max cooking time: ");
            if (scanner.hasNextInt()) {
                int maxTime = Integer.valueOf(scanner.nextLine());
                register.findTime(maxTime);
                break;
            } else {
                System.out.println("INVALID INPUT.\n" + 
                        "Please enter time i.e. 15");
            }
        }
    }
}
