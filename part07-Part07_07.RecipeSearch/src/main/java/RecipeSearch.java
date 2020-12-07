
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeRegister register = new RecipeRegister();
        UserInterface ui = new UserInterface(register, scanner);
        
        ui.findFile(); // asks user for file name & searches.
    }

}
