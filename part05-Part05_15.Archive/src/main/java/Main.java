
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        boolean exists = false;
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(id, name);
            for (int i = 0; i < items.size(); i++) {
                if (item.equals(items.get(i))) {
                    exists = true;
                    break;
                }
            }
            
            if (!exists) {
                items.add(item);
            }
            
            exists = false;
        }

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
