
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        boolean exists = false;
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).equals(meal)) {
                exists = true;
                break;
            }
        }
        if (exists == false) {
            meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        this.meals = new ArrayList<>();
    }
}
